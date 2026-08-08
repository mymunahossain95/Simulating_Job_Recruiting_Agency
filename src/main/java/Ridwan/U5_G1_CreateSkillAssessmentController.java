package Ridwan;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;

import nonuser.SkillAssessmentTest;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G1_CreateSkillAssessmentController {

    @javafx.fxml.FXML
    private TableColumn<SkillAssessmentTest, String> testIdColumn;

    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;

    @javafx.fxml.FXML
    private TableColumn<SkillAssessmentTest, String> titleColumn;

    @javafx.fxml.FXML
    private TableColumn<SkillAssessmentTest, String> statusColumn;

    @javafx.fxml.FXML
    private TableColumn<SkillAssessmentTest, String> creationDateColumn;

    @javafx.fxml.FXML
    private TableView<SkillAssessmentTest> assessmentTable;

    @javafx.fxml.FXML
    private TextField testTitleField;

    @javafx.fxml.FXML
    private TableColumn<SkillAssessmentTest, String> categoryColumn;

    @javafx.fxml.FXML
    private TextField instructionAreaTF;

    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<SkillAssessmentTest> assessmentList;

    @javafx.fxml.FXML
    public void initialize() {

        // Adding options to skill category combo box
        categoryComboBox.getItems().addAll(
                "Software Engineering",
                "Data Analysis",
                "Project Management",
                "Cybersecurity",
                "UI/UX Design"
        );

        // Map TableView columns to getter methods in SkillAssessmentTest class
        testIdColumn.setCellValueFactory(new PropertyValueFactory<>("testId"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("testTitle"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("skillCategory"));
        creationDateColumn.setCellValueFactory(new PropertyValueFactory<>("creationDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Read existing data from binary file using databaseAccessor
        assessmentList = databaseAccessor.readObject("SkillAssessmentTests.bin");

        // Display list items inside TableView
        assessmentTable.setItems(assessmentList);
    }

    @javafx.fxml.FXML
    public void saveTestBtnOnAction(ActionEvent actionEvent) {

        // Input validation for Test Title
        if (testTitleField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please enter test title.");
            statusLabel.setText("Status: Enter Test Title");
            return;
        }

        // Input validation for Category
        if (categoryComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select skill category.");
            statusLabel.setText("Status: Select Skill Category");
            return;
        }

        // Input validation for Instructions
        if (instructionAreaTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please enter instructions.");
            statusLabel.setText("Status: Enter Instructions");
            return;
        }

        // Generating String testId (e.g., T-1, T-2)
        String generatedTestId = "T-" + (assessmentList.size() + 1);

        // Creating object matching your SkillAssessmentTest constructor signature
        SkillAssessmentTest newTest = new SkillAssessmentTest(
                generatedTestId,
                testTitleField.getText(),
                categoryComboBox.getValue(),
                instructionAreaTF.getText(),
                "2026-08-08",
                "Active"
        );

        // Add to observable list and save to binary file
        assessmentList.add(newTest);
        databaseAccessor.writeObject("SkillAssessmentTests.bin", assessmentList);

        // Update status label and show information alert
        statusLabel.setText("Status: Assessment Created Successfully");
        AlertGenerator.showInformationAlert("Success", "Skill assessment test created successfully.");

        // Clear input fields after saving
        testTitleField.clear();
        instructionAreaTF.clear();
        categoryComboBox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/SkillAssesmentOfficerDashboardView.fxml"
        );
    }
}
