package Ridwan;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G3_CancelInterviewController {

    @javafx.fxml.FXML
    private TableView<InterviewSchedule> interviewTable;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> interviewIdColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewSchedule, String> dateColumn;

    @javafx.fxml.FXML
    private TextField reasonField;

    private ObservableList<InterviewSchedule> scheduleList;

    @javafx.fxml.FXML
    public void initialize() {
        // Bind TableView columns to getter methods in InterviewSchedule model
        interviewIdColumn.setCellValueFactory(new PropertyValueFactory<>("interviewId"));
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Read saved interview schedules from binary storage
        scheduleList = databaseAccessor.readObject("InterviewSchedules.bin");

        // Set items to table
        interviewTable.setItems(scheduleList);
    }

    @javafx.fxml.FXML
    public void cancelBtnOnAction(ActionEvent actionEvent) {

        // Get selected interview session from table
        InterviewSchedule selectedInterview = interviewTable.getSelectionModel().getSelectedItem();

        // Validate selection
        if (selectedInterview == null) {
            AlertGenerator.showWarningAlert(
                    "Selection Error",
                    "Please select an interview from the list to cancel."
            );
            return;
        }

        String reason = reasonField.getText().trim();

        // Validate cancellation reason
        if (reason.isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "Validation Error",
                    "Please enter a cancellation reason."
            );
            return;
        }

        // Update interview status
        selectedInterview.setStatus("Cancelled");

        // Save updated list to binary file via databaseAccessor
        databaseAccessor.writeObject("InterviewSchedules.bin", scheduleList);

        // Refresh table display
        interviewTable.refresh();

        AlertGenerator.showInformationAlert(
                "Success",
                "Interview ID " + selectedInterview.getInterviewId() + " has been successfully cancelled.\nReason: " + reason
        );

        // Reset input fields
        reasonField.clear();
        interviewTable.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
