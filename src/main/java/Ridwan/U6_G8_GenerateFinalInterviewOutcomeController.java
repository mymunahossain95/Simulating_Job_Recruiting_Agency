package Ridwan;

import java.util.Random;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewOutcome;
import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G8_GenerateFinalInterviewOutcomeController {

    @javafx.fxml.FXML
    private ComboBox<String> interviewComboBox;

    @javafx.fxml.FXML
    private TableView<InterviewOutcome> outcomeTable;

    @javafx.fxml.FXML
    private TableColumn<InterviewOutcome, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewOutcome, Double> scoreColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewOutcome, String> decisionColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewOutcome, String> remarksColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewOutcome, String> interviewIDColumn;

    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<InterviewSchedule> scheduleList;
    private ObservableList<InterviewOutcome> outcomeList;

    @javafx.fxml.FXML
    public void initialize() {

        // Bind TableView columns to InterviewOutcome getter methods
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        decisionColumn.setCellValueFactory(new PropertyValueFactory<>("decision"));
        remarksColumn.setCellValueFactory(new PropertyValueFactory<>("remarks"));
        interviewIDColumn.setCellValueFactory(new PropertyValueFactory<>("interviewId"));

        // Load interview schedules to populate the dropdown
        scheduleList = databaseAccessor.readObject("InterviewSchedules.bin");
        for (InterviewSchedule schedule : scheduleList) {
            interviewComboBox.getItems().add(
                    schedule.getInterviewId() + " - " + schedule.getCandidateName()
            );
        }

        // Read saved outcomes from binary file
        outcomeList = databaseAccessor.readObject("InterviewOutcomes.bin");
        outcomeTable.setItems(outcomeList);
    }

    @javafx.fxml.FXML
    public void generateOutcomeBtnOnAction(ActionEvent actionEvent) {

        String selectedItem = interviewComboBox.getValue();

        // Validate interview selection
        if (selectedItem == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select an interview from the dropdown.");
            statusLabel.setText("Status: Select an interview first.");
            return;
        }

        String selectedInterviewId = selectedItem.split(" - ")[0];
        String candidateName = selectedItem.split(" - ")[1];

        // Check if outcome already exists for this interview
        for (InterviewOutcome outcome : outcomeList) {
            if (outcome.getInterviewId().equals(selectedInterviewId)) {
                AlertGenerator.showInformationAlert(
                        "Outcome Exists",
                        "Outcome for Interview ID " + selectedInterviewId + " has already been generated."
                );
                statusLabel.setText("Status: Outcome already generated for " + selectedInterviewId);
                return;
            }
        }

        // Generate score and decision
        Random random = new Random();
        double score = 65.0 + (35.0 * random.nextDouble()); // Random score between 65.0 and 100.0
        score = Math.round(score * 10.0) / 10.0; // Round to 1 decimal place

        String decision = score >= 80.0 ? "Selected" : (score >= 70.0 ? "On Hold" : "Rejected");
        String remarks = score >= 80.0 ? "Excellent technical & communication skills" :
                (score >= 70.0 ? "Meets requirements, pending secondary review" : "Does not meet role requirements");

        // Create new InterviewOutcome object:
        // InterviewOutcome(candidateName, score, decision, remarks, interviewId)
        InterviewOutcome newOutcome = new InterviewOutcome(
                candidateName,
                score,
                decision,
                remarks,
                selectedInterviewId
        );

        // Save outcome to list and write back to binary storage
        outcomeList.add(newOutcome);
        databaseAccessor.writeObject("InterviewOutcomes.bin", outcomeList);

        // Update UI status and prompt feedback
        statusLabel.setText("Status: Successfully generated outcome for " + candidateName + " (" + decision + ")");
        AlertGenerator.showInformationAlert(
                "Outcome Generated",
                "Final Outcome for " + candidateName + ":\n" +
                        "Score: " + score + "\n" +
                        "Decision: " + decision + "\n" +
                        "Remarks: " + remarks
        );

        // Reset dropdown selection
        interviewComboBox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Ridwan/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
