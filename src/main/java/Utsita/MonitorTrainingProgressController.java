package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.ManageTrainingAttendance;
import nonuser.MonitorTrainingProgress;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class MonitorTrainingProgressController {

    @javafx.fxml.FXML
    private TableColumn<MonitorTrainingProgress, String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> sessionComboBox;
    @javafx.fxml.FXML
    private TableColumn<MonitorTrainingProgress, String> attendanceTableColumn;
    @javafx.fxml.FXML
    private TableView<MonitorTrainingProgress> trainingProgressTableView;
    @javafx.fxml.FXML
    private TableColumn<MonitorTrainingProgress, String> progressTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramComboBox;
    @javafx.fxml.FXML
    private Label completationRateLabel;
    @javafx.fxml.FXML
    private TableColumn<MonitorTrainingProgress, String> candidateTableColumn;

    @javafx.fxml.FXML
    public void initialize(){
        trainingProgramComboBox.getItems().addAll(
                "Java Programming",
                "Web Development",
                "Data Analytics",
                "Software Testing"
        );
        sessionComboBox.getItems().addAll(
                "Session 1",
                "Session 2",
                "Session 3",
                "Session 4"
        );

        candidateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName")
        );
        attendanceTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("attendance")
        );
        progressTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("progress")
        );
        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );
    }

    @javafx.fxml.FXML
    public void loadProgressButton(ActionEvent event) {

        if (trainingProgramComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Training Program",
                    "Please select a training program."
            );
            return;
        }

        if (sessionComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Session",
                    "Please select a session."
            );
            return;
        }

        ObservableList<ManageTrainingAttendance> attendanceList =
                databaseAccessor.readObject("TrainingAttendance.bin");

        trainingProgressTableView.getItems().clear();

        for (ManageTrainingAttendance attendance : attendanceList) {

            trainingProgressTableView.getItems().add(
                    new MonitorTrainingProgress(
                            attendance.getCandidateName(),
                            attendance.getAttendance(),
                            "0%",
                            attendance.getStatus()
                    )
            );
        }

        updateCompletionRate();

        AlertGenerator.showInformationAlert(
                "Loaded",
                "Training progress loaded successfully."
        );
    }


    @javafx.fxml.FXML
    public void updateProgressButton(ActionEvent event) {

        MonitorTrainingProgress selected =
                trainingProgressTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {

            AlertGenerator.showWarningAlert(
                    "No Selection",
                    "Please select a candidate."
            );
            return;
        }

        selected.setProgress("100%");
        selected.setStatus("Completed");

        trainingProgressTableView.refresh();

        updateCompletionRate();

        AlertGenerator.showInformationAlert(
                "Updated",
                "Training progress updated successfully."
        );
    }

    private void updateCompletionRate() {

        int total = trainingProgressTableView.getItems().size();

        if (total == 0) {
            completationRateLabel.setText("Completion Rate: 0%");
            return;
        }

        int completed = 0;

        for (MonitorTrainingProgress progress :
                trainingProgressTableView.getItems()) {

            if (progress.getStatus().equalsIgnoreCase("Completed")) {
                completed++;
            }
        }

        int percentage = (completed * 100) / total;

        completationRateLabel.setText(
                "Completion Rate: " + percentage + "%"
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/TrainingCoordinatorDashboard");
    }
}
