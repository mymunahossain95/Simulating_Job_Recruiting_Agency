package Ridwan;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewAttendance;
import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G6_RecordInterviewAttendanceController {

    @javafx.fxml.FXML
    private TableView<InterviewAttendance> attendanceTV;

    @javafx.fxml.FXML
    private TableColumn<InterviewAttendance, String> interviewIdColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewAttendance, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewAttendance, String> attendanceColumn;

    @javafx.fxml.FXML
    private ComboBox<String> attendanceComboBox;

    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<InterviewAttendance> attendanceList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populate attendance status choices
        attendanceComboBox.getItems().addAll("Present", "Absent", "Late", "Excused");

        // Bind TableView columns to InterviewAttendance getters
        interviewIdColumn.setCellValueFactory(new PropertyValueFactory<>("interviewId"));
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        attendanceColumn.setCellValueFactory(new PropertyValueFactory<>("attendanceStatus"));

        // Read saved records from binary storage
        attendanceList = databaseAccessor.readObject("InterviewAttendances.bin");

        // If file is empty or missing existing schedules, auto-populate from InterviewSchedules
        if (attendanceList.isEmpty()) {
            ObservableList<InterviewSchedule> scheduleList = databaseAccessor.readObject("InterviewSchedules.bin");
            for (InterviewSchedule schedule : scheduleList) {
                attendanceList.add(new InterviewAttendance(
                        schedule.getCandidateName(),
                        schedule.getInterviewId(),
                        "Pending"
                ));
            }
            databaseAccessor.writeObject("InterviewAttendances.bin", attendanceList);
        }

        // Set items to TableView
        attendanceTV.setItems(attendanceList);

        // Populate attendance status dropdown when user selects a table row
        attendanceTV.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        attendanceComboBox.setValue(newSelection.getAttendanceStatus());
                    }
                }
        );
    }

    @javafx.fxml.FXML
    public void saveBtnOnAction(ActionEvent actionEvent) {

        // Get selected row from table
        InterviewAttendance selectedAttendance = attendanceTV.getSelectionModel().getSelectedItem();

        // Validate table selection
        if (selectedAttendance == null) {
            AlertGenerator.showWarningAlert("Selection Error", "Please select an interview record from the table.");
            statusLabel.setText("Status: Select an interview record first");
            return;
        }

        String selectedStatus = attendanceComboBox.getValue();

        // Validate status selection
        if (selectedStatus == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an attendance status.");
            statusLabel.setText("Status: Select an attendance status");
            return;
        }

        // Update attendance status
        selectedAttendance.setAttendanceStatus(selectedStatus);

        // Persist updated list to binary file
        databaseAccessor.writeObject("InterviewAttendances.bin", attendanceList);

        // Refresh TableView display
        attendanceTV.refresh();

        statusLabel.setText("Status: Attendance updated successfully for " + selectedAttendance.getCandidateName());
        AlertGenerator.showInformationAlert(
                "Success",
                "Attendance for " + selectedAttendance.getCandidateName() + " (" + selectedAttendance.getInterviewId() + ") updated to: " + selectedStatus
        );

        // Reset inputs
        attendanceComboBox.getSelectionModel().clearSelection();
        attendanceTV.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
