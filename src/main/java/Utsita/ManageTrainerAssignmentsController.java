package Utsita;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.ManageTrainerAssignments;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class ManageTrainerAssignmentsController {

    @javafx.fxml.FXML
    private TextField searchTrainer;
    @javafx.fxml.FXML
    private TableView<ManageTrainerAssignments> trainerAssignmentTableView;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainerAssignments, String> trainerIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainerAssignments, String> trainingProgramTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> trainerComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramComboBox;
    @javafx.fxml.FXML
    private DatePicker assignmentDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainerAssignments, String> trainerNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainerAssignments, String> statusTableColumn1;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainerAssignments, String> assignmentDateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {

        trainerComboBox.getItems().addAll(
                "Trainer 1",
                "Trainer 2",
                "Trainer 3"
        );

        trainingProgramComboBox.getItems().addAll(
                "Java",
                "Python",
                "Database"
        );

        trainerIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trainerId"));
        trainerNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trainerName"));
        trainingProgramTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("trainingProgram"));
        assignmentDateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("assignmentDate"));
        statusTableColumn1.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        trainerAssignmentTableView.setItems(databaseAccessor.readObject("TrainerAssignment.bin")
        );
    }

    @javafx.fxml.FXML
    public void assignTrainerButton(ActionEvent actionEvent) {
        if (trainerComboBox.getValue() == null ||
                trainingProgramComboBox.getValue() == null ||
                assignmentDateDatePicker.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all fields."
            );
            return;
        }
        ManageTrainerAssignments assignment =
                new ManageTrainerAssignments(

                        String.valueOf(trainerAssignmentTableView.getItems().size() + 1),
                        trainerComboBox.getValue(),
                        trainingProgramComboBox.getValue(),
                        assignmentDateDatePicker.getValue(),
                        "Assigned"
                );

        trainerAssignmentTableView.getItems().add(assignment);

        AlertGenerator.showInformationAlert(
                "Success",
                "Trainer assigned successfully."
        );
    }

    @javafx.fxml.FXML
    public void removeButton(ActionEvent actionEvent) {
        ManageTrainerAssignments assignment =
                trainerAssignmentTableView.getSelectionModel().getSelectedItem();

        if (assignment == null) {
            AlertGenerator.showWarningAlert(
                    "No Selection",
                    "Select a trainer first."
            );
            return;
        }
        trainerAssignmentTableView.getItems().remove(assignment);

        AlertGenerator.showInformationAlert(
                "Removed",
                "Assignment removed."
        );
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        ManageTrainerAssignments assignment =
                trainerAssignmentTableView.getSelectionModel().getSelectedItem();

        if (assignment == null) {

            AlertGenerator.showWarningAlert(
                    "No Selection",
                    "Select a trainer first."
            );
            return;
        }

        assignment.setTrainerName(trainerComboBox.getValue());
        assignment.setTrainingProgram(trainingProgramComboBox.getValue());

        trainerAssignmentTableView.refresh();

        AlertGenerator.showInformationAlert(
                "Updated",
                "Assignment updated."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/TrainingCoordinatorDashboard");
    }
}
