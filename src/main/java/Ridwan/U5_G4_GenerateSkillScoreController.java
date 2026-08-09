package Ridwan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.Evaluation;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G4_GenerateSkillScoreController {

    // FXML fields linked to UI elements in Scene Builder
    @javafx.fxml.FXML
    private ComboBox<String> candidateComboBox;

    @javafx.fxml.FXML
    private TableView<Evaluation> scoreTable;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, Double> scoreColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, Double> percentageColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> gradeColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> statusColumn;

    // ObservableLists for storing all evaluations and filtered display items
    private ObservableList<Evaluation> evaluationList;
    private ObservableList<Evaluation> filteredList;

    @javafx.fxml.FXML
    public void initialize() {

        // Adding candidate options to ComboBox
        candidateComboBox.getItems().addAll(
                "John Doe",
                "Jane Smith",
                "Alex Johnson",
                "Rahim Ahmed"
        );

        // Map TableView columns to Evaluation getter methods
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        percentageColumn.setCellValueFactory(new PropertyValueFactory<>("percentage"));
        gradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Load all evaluation records from binary file using databaseAccessor
        evaluationList = databaseAccessor.readObject("Evaluations.bin");

        // Initialize empty list for filtered table display
        filteredList = FXCollections.observableArrayList();
        scoreTable.setItems(filteredList);
    }

    // Event handler for Generate Score button
    @javafx.fxml.FXML
    public void generateScoreBtnOnAction(ActionEvent actionEvent) {

        // Validation for Candidate Selection
        String selectedCandidate = candidateComboBox.getValue();

        if (selectedCandidate == null) {
            AlertGenerator.showWarningAlert(
                    "Selection Error",
                    "Please select a candidate to generate score."
            );
            return;
        }

        // Clear previous results from the table view
        filteredList.clear();

        // Filter evaluations list for the selected candidate
        for (Evaluation eval : evaluationList) {
            if (eval.getCandidateName().equalsIgnoreCase(selectedCandidate)) {
                filteredList.add(eval);
            }
        }

        // Check if any evaluation record was found for the candidate
        if (filteredList.isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "No Records Found",
                    "No evaluation records found for candidate: " + selectedCandidate
            );
        } else {
            AlertGenerator.showInformationAlert(
                    "Success",
                    "Skill scores generated successfully for " + selectedCandidate
            );
        }
    }

    // Back to Dashboard button event handler
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/SkillAssesmentOfficerDashboardView.fxml"
        );
    }
}
