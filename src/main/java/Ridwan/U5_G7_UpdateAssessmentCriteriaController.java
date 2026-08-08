package Ridwan;

import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.AssessmentCriteria;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G7_UpdateAssessmentCriteriaController {

    // FXML fields linked to UI elements in Scene Builder
    @javafx.fxml.FXML
    private Label titleLabel;

    @javafx.fxml.FXML
    private TableView<AssessmentCriteria> criteriaTable;

    @javafx.fxml.FXML
    private TableColumn<AssessmentCriteria, String> categoryColumn;

    @javafx.fxml.FXML
    private TableColumn<AssessmentCriteria, Double> weightageColumn;

    @javafx.fxml.FXML
    private TableColumn<AssessmentCriteria, String> updateDateColumn;

    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;

    @javafx.fxml.FXML
    private TextField weightageField;

    @javafx.fxml.FXML
    private Label statusLabel;

    // ObservableList for managing data loaded from binary storage
    private ObservableList<AssessmentCriteria> criteriaList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populate Category ComboBox with sample options
        categoryComboBox.getItems().addAll(
                "Problem Solving",
                "Coding Skills",
                "System Design",
                "Communication",
                "Domain Knowledge"
        );

        // Bind TableView columns to AssessmentCriteria getter methods
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("skillCategory"));
        weightageColumn.setCellValueFactory(new PropertyValueFactory<>("weightage"));
        updateDateColumn.setCellValueFactory(new PropertyValueFactory<>("updatedDate"));

        // Load saved assessment criteria records from binary file
        criteriaList = databaseAccessor.readObject("AssessmentCriteria.bin");

        // Display items inside TableView
        criteriaTable.setItems(criteriaList);

        // Populate fields automatically when a user clicks a row in the criteria table
        criteriaTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        categoryComboBox.setValue(newSelection.getSkillCategory());
                        weightageField.setText(String.valueOf(newSelection.getWeightage()));
                    }
                }
        );
    }

    // Event handler for Update Button
    @javafx.fxml.FXML
    public void updateBtnOnAction(ActionEvent actionEvent) {

        String selectedCategory = categoryComboBox.getValue();

        // Validate Category Selection
        if (selectedCategory == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select a category.");
            statusLabel.setText("Status: Select a category first");
            return;
        }

        // Validate Weightage Field
        if (weightageField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please enter a weightage value.");
            statusLabel.setText("Status: Enter weightage value");
            return;
        }

        double newWeightage;
        try {
            newWeightage = Double.parseDouble(weightageField.getText());
        } catch (NumberFormatException e) {
            AlertGenerator.showWarningAlert("Input Error", "Weightage must be a valid numeric value.");
            statusLabel.setText("Status: Weightage must be numeric");
            return;
        }

        String currentDate = LocalDate.now().toString();
        boolean found = false;

        // Check if category already exists in table to update it
        for (AssessmentCriteria criteria : criteriaList) {
            if (criteria.getSkillCategory().equalsIgnoreCase(selectedCategory)) {
                criteria.setWeightage(newWeightage);
                criteria.setUpdatedDate(currentDate);
                found = true;
                break;
            }
        }

        // If category is not in list, add a new AssessmentCriteria object
        if (!found) {
            AssessmentCriteria newCriteria = new AssessmentCriteria(selectedCategory, newWeightage, currentDate);
            criteriaList.add(newCriteria);
        }

        // Save updated list to binary file via databaseAccessor
        databaseAccessor.writeObject("AssessmentCriteria.bin", criteriaList);

        // Refresh TableView display
        criteriaTable.refresh();

        // Update UI Status and show success alert
        statusLabel.setText("Status: Assessment criteria updated successfully!");
        AlertGenerator.showInformationAlert(
                "Success",
                "Assessment criteria for '" + selectedCategory + "' updated successfully."
        );

        // Clear input fields and table selection
        categoryComboBox.getSelectionModel().clearSelection();
        weightageField.clear();
        criteriaTable.getSelectionModel().clearSelection();
    }

    // Event handler for Back to Dashboard button
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/SkillAssesmentOfficerDashboardView.fxml"
        );
    }
}
