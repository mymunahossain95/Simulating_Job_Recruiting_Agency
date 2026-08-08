package Ridwan;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;

import nonuser.TestAssignment;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G2_AssignSkillTestController {

    @javafx.fxml.FXML
    private ComboBox<String> candidateComboBox;

    @javafx.fxml.FXML
    private ComboBox<String> assessmentComboBox;

    @javafx.fxml.FXML
    private TableView<TestAssignment> assignmentTable;

    @javafx.fxml.FXML
    private TableColumn<TestAssignment, String> assignmentIdColumn;

    @javafx.fxml.FXML
    private TableColumn<TestAssignment, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<TestAssignment, String> assessmentColumn;

    @javafx.fxml.FXML
    private TableColumn<TestAssignment, String> dateColumn;

    @javafx.fxml.FXML
    private TableColumn<TestAssignment, String> statusColumn;

    @javafx.fxml.FXML
    private Label statusLabel;

    // List to hold table items in memory
    private ObservableList<TestAssignment> assignmentList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populating candidate options
        candidateComboBox.getItems().addAll(
                "John Doe",
                "Jane Smith",
                "Alex Johnson",
                "Rahim Ahmed"
        );

        // Populating assessment options
        assessmentComboBox.getItems().addAll(
                "Java Fundamentals Test",
                "Database Queries Test",
                "UI/UX Design Assessment",
                "Python Basic Test"
        );

        // Map TableView columns to getter methods in TestAssignment class
        assignmentIdColumn.setCellValueFactory(new PropertyValueFactory<>("assignmentId"));
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        assessmentColumn.setCellValueFactory(new PropertyValueFactory<>("assessmentName"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("assignmentDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Read existing assignments from binary file using databaseAccessor
        assignmentList = databaseAccessor.readObject("TestAssignments.bin");

        // Set items to TableView
        assignmentTable.setItems(assignmentList);
    }

    // Event handler for Assign Test button
    @javafx.fxml.FXML
    public void assignBtnOnAction(ActionEvent actionEvent) {

        // Input validation for Candidate ComboBox
        if (candidateComboBox.getValue().isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select a candidate.");
            statusLabel.setText("Status Label : Select Candidate Name");
            return;
        }

        // Input validation for Assessment ComboBox
        if (assessmentComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an assessment.");
            statusLabel.setText("Status Label : Select Assessment Name");
            return;
        }

        // Generating unique String assignment ID (e.g., A-1, A-2)
        String newId = "A-" + (assignmentList.size() + 1);

        // Creating new TestAssignment matching your exact constructor signature:
        // TestAssignment(status, assignmentDate, assessmentName, candidateName, assignmentId)
        TestAssignment newAssignment = new TestAssignment(
                "Assigned",
                "2026-08-08",
                assessmentComboBox.getValue(),
                candidateComboBox.getValue(),
                newId
        );

        // Add to list and save to binary file
        assignmentList.add(newAssignment);
        databaseAccessor.writeObject("TestAssignments.bin", assignmentList);

        // Update status label and show information alert
        statusLabel.setText("Status Label : Assessment Assigned Successfully");
        AlertGenerator.showInformationAlert("Success", "Skill test assigned successfully.");

        // Clear ComboBox selections
        candidateComboBox.getSelectionModel().clearSelection();
        assessmentComboBox.getSelectionModel().clearSelection();
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
