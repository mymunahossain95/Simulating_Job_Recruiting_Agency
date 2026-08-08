package Ridwan;

import java.time.LocalDate;
import java.util.UUID;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import nonuser.InterviewNotification;
import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G5_SendInterviewNotificationController {

    @javafx.fxml.FXML
    private ComboBox<String> interviewComboBox;

    @javafx.fxml.FXML
    private TextField messageField;

    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<InterviewSchedule> scheduleList;
    private ObservableList<InterviewNotification> notificationList;

    @javafx.fxml.FXML
    public void initialize() {
        // Load existing interview schedules to populate the dropdown choices
        scheduleList = databaseAccessor.readObject("InterviewSchedules.bin");

        for (InterviewSchedule schedule : scheduleList) {
            interviewComboBox.getItems().add(
                    schedule.getInterviewId() + " - " + schedule.getCandidateName()
            );
        }

        // Load existing notifications stored in binary file
        notificationList = databaseAccessor.readObject("InterviewNotifications.bin");
    }

    @javafx.fxml.FXML
    public void sendBtnOnAction(ActionEvent actionEvent) {

        String selectedItem = interviewComboBox.getValue();
        String messageText = messageField.getText().trim();

        // Input validation for interview selection
        if (selectedItem == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an interview.");
            statusLabel.setText("Status: Please select an interview first");
            return;
        }

        // Input validation for notification message
        if (messageText.isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please enter a message to send.");
            statusLabel.setText("Status: Message body cannot be empty");
            return;
        }

        // Extract selected InterviewSchedule object details
        String selectedInterviewId = selectedItem.split(" - ")[0];
        InterviewSchedule selectedSchedule = null;

        for (InterviewSchedule schedule : scheduleList) {
            if (schedule.getInterviewId().equals(selectedInterviewId)) {
                selectedSchedule = schedule;
                break;
            }
        }

        String candidateName = (selectedSchedule != null) ? selectedSchedule.getCandidateName() : "Unknown";
        LocalDate scheduledDate = LocalDate.now();

        if (selectedSchedule != null && selectedSchedule.getDate() != null && !selectedSchedule.getDate().isEmpty()) {
            try {
                scheduledDate = LocalDate.parse(selectedSchedule.getDate());
            } catch (Exception e) {
                scheduledDate = LocalDate.now();
            }
        }

        // Generate unique Notification ID
        String notificationId = "NTF-" + UUID.randomUUID().toString().substring(0, 5).toUpperCase();

        // Create new InterviewNotification object matching constructor signature:
        // InterviewNotification(notificationId, candidateId, candidateName, message, scheduledDate, status)
        InterviewNotification newNotification = new InterviewNotification(
                notificationId,
                selectedInterviewId, // using interview ID as candidateId/reference ID
                candidateName,
                messageText,
                scheduledDate,
                "Sent"
        );

        // Save to list and write back to binary storage
        notificationList.add(newNotification);
        databaseAccessor.writeObject("InterviewNotifications.bin", notificationList);

        // UI update and notification alert
        statusLabel.setText("Status: Notification sent successfully to " + candidateName + "!");
        AlertGenerator.showInformationAlert(
                "Success",
                "Notification sent to " + candidateName + " (" + selectedInterviewId + ")."
        );

        // Reset form inputs
        interviewComboBox.getSelectionModel().clearSelection();
        messageField.clear();
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
