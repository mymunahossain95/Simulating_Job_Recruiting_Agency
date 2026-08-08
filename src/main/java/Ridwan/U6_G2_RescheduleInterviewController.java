package Ridwan;

import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G2_RescheduleInterviewController {

    // FXML components linked to UI elements
    @javafx.fxml.FXML
    private TableView<InterviewSchedule> interviewTable;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> interviewIdColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> dateColumn;

    @javafx.fxml.FXML
    private DatePicker newDatePicker;

    @javafx.fxml.FXML
    private ComboBox<String> newTimeComboBox;

    // ObservableList for binary file operations
    private ObservableList<InterviewSchedule> scheduleList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populate new time slots drop-down
        newTimeComboBox.getItems().addAll(
                "09:00 AM",
                "10:30 AM",
                "01:00 PM",
                "02:30 PM",
                "04:00 PM"
        );

        // Bind TableView columns to InterviewSchedule model getter methods
        interviewIdColumn.setCellValueFactory(new PropertyValueFactory<>("interviewId"));
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Read saved interview schedules from binary storage file
        scheduleList = databaseAccessor.readObject("InterviewSchedules.bin");

        // Set items to table
        interviewTable.setItems(scheduleList);

        // Automatically populate input controls when a user selects a row in table
        interviewTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        if (newSelection.getDate() != null && !newSelection.getDate().isEmpty()) {
                            try {
                                newDatePicker.setValue(LocalDate.parse(newSelection.getDate()));
                            } catch (Exception e) {
                                newDatePicker.setValue(null);
                            }
                        }
                        newTimeComboBox.setValue(newSelection.getTime());
                    }
                }
        );
    }

    // Event handler for updateBtn
    @javafx.fxml.FXML
    public void updateBtnOnAction(ActionEvent actionEvent) {

        // Get currently selected interview from table
        InterviewSchedule selectedInterview = interviewTable.getSelectionModel().getSelectedItem();

        // Validation for selection
        if (selectedInterview == null) {
            AlertGenerator.showWarningAlert(
                    "Selection Error",
                    "Please select an interview from the table to reschedule."
            );
            return;
        }

        LocalDate selectedDate = newDatePicker.getValue();
        String selectedTime = newTimeComboBox.getValue();

        // Validation for new date
        if (selectedDate == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please pick a new interview date.");
            return;
        }

        // Validation for new time
        if (selectedTime == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select a new interview time.");
            return;
        }

        // Update selected InterviewSchedule fields
        selectedInterview.setDate(selectedDate.toString());
        selectedInterview.setTime(selectedTime);
        selectedInterview.setStatus("Rescheduled");

        // Save updated list back to binary file via databaseAccessor
        databaseAccessor.writeObject("InterviewSchedules.bin", scheduleList);

        // Refresh TableView
        interviewTable.refresh();

        AlertGenerator.showInformationAlert(
                "Success",
                "Interview ID " + selectedInterview.getInterviewId() + " has been successfully rescheduled to " + selectedDate + " at " + selectedTime + "."
        );

        // Reset input fields and clear selection
        newDatePicker.setValue(null);
        newTimeComboBox.getSelectionModel().clearSelection();
        interviewTable.getSelectionModel().clearSelection();
    }

    // Event handler for Back to Dashboard button
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
