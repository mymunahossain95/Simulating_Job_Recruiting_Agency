package Ridwan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.TrainingRecommendation;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G8_TrainingRecommendationController {

    // FXML fields mapped directly to layout components
    @javafx.fxml.FXML
    private ComboBox<String> candidateComboBox;

    @javafx.fxml.FXML
    private TableView<TrainingRecommendation> recommendationTable;

    @javafx.fxml.FXML
    private TableColumn<TrainingRecommendation, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<TrainingRecommendation, String> weakSkillColumn;

    @javafx.fxml.FXML
    private TableColumn<TrainingRecommendation, String> trainingColumn;

    @javafx.fxml.FXML
    private TableColumn<TrainingRecommendation, String> priorityColumn;

    @javafx.fxml.FXML
    private Label statusLabel;

    // ObservableLists for storing all recommendations and displaying filtered ones
    private ObservableList<TrainingRecommendation> allRecommendations;
    private ObservableList<TrainingRecommendation> displayList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populate Candidate options inside the ComboBox
        candidateComboBox.getItems().addAll(
                "John Doe",
                "Jane Smith",
                "Alex Johnson",
                "Rahim Ahmed"
        );

        // Bind TableView columns to getter methods in TrainingRecommendation model
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        weakSkillColumn.setCellValueFactory(new PropertyValueFactory<>("weakSkillArea"));
        trainingColumn.setCellValueFactory(new PropertyValueFactory<>("recommendedTraining"));
        priorityColumn.setCellValueFactory(new PropertyValueFactory<>("priorityLevel"));

        // Read saved recommendations from binary file via databaseAccessor
        allRecommendations = databaseAccessor.readObject("TrainingRecommendations.bin");

        // Prepare table view display list
        displayList = FXCollections.observableArrayList();
        recommendationTable.setItems(displayList);
    }

    // Event handler matching onAction="#generateRecommendationBtnOA"
    @javafx.fxml.FXML
    public void generateRecommendationBtnOA(ActionEvent actionEvent) {

        String selectedCandidate = candidateComboBox.getValue();

        // Validation for candidate choice
        if (selectedCandidate == null) {
            AlertGenerator.showWarningAlert(
                    "Validation Error",
                    "Please select a candidate to generate training recommendations."
            );
            statusLabel.setText("Status Label: Select a candidate first");
            return;
        }

        // Clear existing items in filtered list
        displayList.clear();

        // Check if saved recommendations exist in binary file
        for (TrainingRecommendation rec : allRecommendations) {
            if (rec.getCandidateName().equalsIgnoreCase(selectedCandidate)) {
                displayList.add(rec);
            }
        }

        // If no records were found in binary storage, generate default sample recommendations
        if (displayList.isEmpty()) {
            TrainingRecommendation sample1 = new TrainingRecommendation(
                    selectedCandidate,
                    "Data Structures & Algorithms",
                    "Advanced Java & DSA Bootcamp",
                    "High"
            );
            TrainingRecommendation sample2 = new TrainingRecommendation(
                    selectedCandidate,
                    "Database Optimization",
                    "SQL Tuning & Indexing Course",
                    "Medium"
            );

            displayList.add(sample1);
            displayList.add(sample2);

            // Append new recommendations to master list and save to binary file
            allRecommendations.addAll(displayList);
            databaseAccessor.writeObject("TrainingRecommendations.bin", allRecommendations);
        }

        statusLabel.setText("Status Label: Training recommendations generated for " + selectedCandidate);

        AlertGenerator.showInformationAlert(
                "Success",
                "Training recommendations generated successfully for " + selectedCandidate
        );
    }

    // Back to Dashboard button event handler
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/SkillAssesmentOfficerDashboardView.fxml"
        );
    }
}
