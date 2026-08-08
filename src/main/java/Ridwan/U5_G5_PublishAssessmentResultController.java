package Ridwan;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import nonuser.Evaluation;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G5_PublishAssessmentResultController {

    // FXML fields linked to your specific layout IDs
    @javafx.fxml.FXML
    private ComboBox<String> assessmentComboBox;

    @javafx.fxml.FXML
    private TableView<Evaluation> draftResultTable;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, Double> scoreColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> gradeColumn;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> statusColumn;

    @javafx.fxml.FXML
    private Text statusLabel;

    // ObservableList for binary file operations
    private ObservableList<Evaluation> evaluationList;

    @javafx.fxml.FXML
    public void initialize() {

        // Adding options to assessment ComboBox
        assessmentComboBox.getItems().addAll(
                "Java Fundamentals Test",
                "Database Queries Test",
                "UI/UX Design Assessment",
                "Python Basic Test"
        );

        // Map TableView columns to Evaluation model methods
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        gradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Read saved evaluation data from binary file
        evaluationList = databaseAccessor.readObject("Evaluations.bin");

        // Display loaded records in table
        draftResultTable.setItems(evaluationList);
    }

    // Event handler matching your FXML onAction="#publishResultBtnOnAction"
    @javafx.fxml.FXML
    public void publishResultBtnOnAction(ActionEvent actionEvent) {

        String selectedAssessment = assessmentComboBox.getValue();

        // Validation for ComboBox selection
        if (selectedAssessment == null) {
            AlertGenerator.showWarningAlert(
                    "Validation Error",
                    "Please select an assessment to publish results."
            );
            statusLabel.setText("Status Label : Select an assessment first");
            return;
        }

        boolean updatedAny = false;

        // Update status for all matching evaluation records
        for (Evaluation eval : evaluationList) {
            if (eval.getAssessmentName().equalsIgnoreCase(selectedAssessment)) {
                eval.setStatus("Published");
                updatedAny = true;
            }
        }

        if (updatedAny) {
            // Save updated evaluations list back to binary file
            databaseAccessor.writeObject("Evaluations.bin", evaluationList);

            // Refresh table view contents
            draftResultTable.refresh();

            statusLabel.setText("Status Label : Results published successfully for " + selectedAssessment);
            AlertGenerator.showInformationAlert(
                    "Success",
                    "Assessment results have been published successfully."
            );
        } else {
            statusLabel.setText("Status Label : No evaluations found for " + selectedAssessment);
            AlertGenerator.showWarningAlert(
                    "No Records Found",
                    "No matching evaluation records found for the selected assessment."
            );
        }

        // Clear ComboBox selection
        assessmentComboBox.getSelectionModel().clearSelection();
    }

    // Back to Dashboard event handler
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/SkillAssesmentOfficerDashboardView.fxml"
        );
    }
}
