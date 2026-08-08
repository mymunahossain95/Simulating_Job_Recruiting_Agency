package Ridwan;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewPanel;
import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G4_AssignInterviewPanelController {

    @javafx.fxml.FXML
    private ComboBox<String> interviewComboBox;

    @javafx.fxml.FXML
    private ComboBox<String> panelMemberComboBox;

    @javafx.fxml.FXML
    private TableView<InterviewPanel> panelTable;

    @javafx.fxml.FXML
    private TableColumn<InterviewPanel, String> interviewIdColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewPanel, String> panelMemberColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewPanel, String> statusColumn;

    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<InterviewPanel> panelList;

    @javafx.fxml.FXML
    public void initialize() {

        // Populate Interview IDs dynamically from saved interview schedules
        ObservableList<InterviewSchedule> schedules = databaseAccessor.readObject("InterviewSchedules.bin");
        for (InterviewSchedule schedule : schedules) {
            interviewComboBox.getItems().add(schedule.getInterviewId());
        }

        // Populate Panel Member choices
        panelMemberComboBox.getItems().addAll(
                "Dr. Alan Turing",
                "Prof. Ada Lovelace",
                "Tech Lead Sarah",
                "HR Manager Robert",
                "Senior Dev Michael"
        );

        // Bind TableView columns to your InterviewPanel model getters
        interviewIdColumn.setCellValueFactory(new PropertyValueFactory<>("interviewId"));
        panelMemberColumn.setCellValueFactory(new PropertyValueFactory<>("panelMembers"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Read saved panel assignments from binary storage
        panelList = databaseAccessor.readObject("InterviewPanels.bin");
        panelTable.setItems(panelList);
    }

    @javafx.fxml.FXML
    public void assignBtnOnAction(ActionEvent actionEvent) {

        String selectedInterviewId = interviewComboBox.getValue();
        String selectedPanelMember = panelMemberComboBox.getValue();

        // Validation for Interview ID selection
        if (selectedInterviewId == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an Interview ID.");
            statusLabel.setText("Status Label : Select an Interview ID");
            return;
        }

        // Validation for Panel Member selection
        if (selectedPanelMember == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select a panel member.");
            statusLabel.setText("Status Label : Select a panel member");
            return;
        }

        // Create new InterviewPanel object matching your constructor:
        // InterviewPanel(interviewId, panelMembers, status)
        InterviewPanel newAssignment = new InterviewPanel(
                selectedInterviewId,
                selectedPanelMember,
                "Assigned"
        );

        // Save to list and write to binary file via databaseAccessor
        panelList.add(newAssignment);
        databaseAccessor.writeObject("InterviewPanels.bin", panelList);

        // Update UI status and show confirmation alert
        statusLabel.setText("Status Label : Panel assigned successfully!");
        AlertGenerator.showInformationAlert(
                "Success",
                "Assigned " + selectedPanelMember + " to Interview ID " + selectedInterviewId + "."
        );

        // Reset selections
        interviewComboBox.getSelectionModel().clearSelection();
        panelMemberComboBox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
