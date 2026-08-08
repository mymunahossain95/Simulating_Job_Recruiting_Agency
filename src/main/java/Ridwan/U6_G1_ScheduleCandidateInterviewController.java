package Ridwan;

import java.time.LocalDate;
import java.util.UUID;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G1_ScheduleCandidateInterviewController {

    // FXML fields mapped directly from your FXML layout
    @javafx.fxml.FXML
    private ComboBox<String> candidateComboBox;

    @javafx.fxml.FXML
    private ComboBox<String> interviewerComboBox;

    @javafx.fxml.FXML
    private ComboBox<String> timeComboBox;

    @javafx.fxml.FXML
    private DatePicker interviewDatePicker;

    @javafx.fxml.FXML
    private TableView<InterviewSchedule> scheduleTable;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> interviewIdColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> interviewerColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> dateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> timeColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> statusColumn;

    @javafx.fxml.FXML
    private Label statusLabel;

    // ObservableList for binary storage operations
    private ObservableList<InterviewSchedule> scheduleList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populate Candidate drop-down
        candidateComboBox.getItems().addAll(
                "John Doe",
                "Jane Smith",
                "Alex Johnson",
                "Rahim Ahmed"
        );

        // Populate Interviewer drop-down
        interviewerComboBox.getItems().addAll(
                "Dr. Alan Turing",
                "Prof. Ada Lovelace",
                "Tech Lead Sarah",
                "HR Manager Robert"
        );

        // Populate Interview Time slots
        timeComboBox.getItems().addAll(
                "09:00 AM",
                "10:30 AM",
                "01:00 PM",
                "02:30 PM",
                "04:00 PM"
        );

        // Bind TableView columns to your specific InterviewSchedule model getters
        interviewIdColumn.setCellValueFactory(new PropertyValueFactory<>("interviewId"));
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        interviewerColumn.setCellValueFactory(new PropertyValueFactory<>("interviewerName"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Read existing interview schedules from binary storage
        scheduleList = databaseAccessor.readObject("InterviewSchedules.bin");

        // Display loaded list in table
        scheduleTable.setItems(scheduleList);
    }

    // Event handler for Save button
    @javafx.fxml.FXML
    public void saveBtnOnAction(ActionEvent actionEvent) {

        String selectedCandidate = candidateComboBox.getValue();
        String selectedInterviewer = interviewerComboBox.getValue();
        String selectedTime = timeComboBox.getValue();
        LocalDate selectedDate = interviewDatePicker.getValue();

        // Input validation for candidate
        if (selectedCandidate == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select a candidate.");
            statusLabel.setText("Status Label: Select a candidate first");
            return;
        }

        // Input validation for interviewer
        if (selectedInterviewer == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an interviewer.");
            statusLabel.setText("Status Label: Select an interviewer");
            return;
        }

        // Input validation for interview date
        if (selectedDate == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please choose an interview date.");
            statusLabel.setText("Status Label: Select an interview date");
            return;
        }

        // Input validation for interview time
        if (selectedTime == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an interview time.");
            statusLabel.setText("Status Label: Select an interview time");
            return;
        }

        // Generate auto-generated ID for new interview session
        String generatedId = "INT-" + UUID.randomUUID().toString().substring(0, 5).toUpperCase();

        // Create new InterviewSchedule instance matching your exact constructor:
        // InterviewSchedule(interviewId, candidateName, interviewerName, date, time, status)
        InterviewSchedule newSchedule = new InterviewSchedule(
                generatedId,
                selectedCandidate,
                selectedInterviewer,
                selectedDate.toString(),
                selectedTime,
                "Scheduled"
        );

        // Append to list and persist to binary file
        scheduleList.add(newSchedule);
        databaseAccessor.writeObject("InterviewSchedules.bin", scheduleList);

        // Refresh UI components
        statusLabel.setText("Status Label: Interview scheduled successfully! (ID: " + generatedId + ")");
        AlertGenerator.showInformationAlert(
                "Success",
                "Interview scheduled successfully for " + selectedCandidate
        );

        // Reset form controls
        candidateComboBox.getSelectionModel().clearSelection();
        interviewerComboBox.getSelectionModel().clearSelection();
        timeComboBox.getSelectionModel().clearSelection();
        interviewDatePicker.setValue(null);
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
