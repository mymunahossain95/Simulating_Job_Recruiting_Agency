package Ridwan;

import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.CandidateAnswer;
import nonuser.Evaluation;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G3_EvaluateCandidateAnswersController {

    // Submissions Table
    @javafx.fxml.FXML
    private TableView<CandidateAnswer> submissionTableView;

    @javafx.fxml.FXML
    private TableColumn<CandidateAnswer, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<CandidateAnswer, String> assessmentColumn;

    @javafx.fxml.FXML
    private TableColumn<CandidateAnswer, LocalDate> submissionDateColumn;

    // Evaluations Table
    @javafx.fxml.FXML
    private TableView<Evaluation> evaluationTable;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> candidateColumnforEvo;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> assessmentColumnEvo;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, Double> scoreColumnEvo;

    @javafx.fxml.FXML
    private TableColumn<Evaluation, String> evaluationDateColumnEvo;

    // Inputs & Status
    @javafx.fxml.FXML
    private TextField answerAreaTF;

    @javafx.fxml.FXML
    private TextField scoreFieldTF;

    @javafx.fxml.FXML
    private TextField remarksAreaTF;

    @javafx.fxml.FXML
    private Label successStatusLabel;

    // Lists for memory management
    private ObservableList<CandidateAnswer> submissionList;
    private ObservableList<Evaluation> evaluationList;

    @javafx.fxml.FXML
    public void initialize() {

        // Setup columns for Submission Table
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        assessmentColumn.setCellValueFactory(new PropertyValueFactory<>("assessmentName"));
        submissionDateColumn.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));

        // Setup columns for Evaluation Table
        candidateColumnforEvo.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        assessmentColumnEvo.setCellValueFactory(new PropertyValueFactory<>("assessmentName"));
        scoreColumnEvo.setCellValueFactory(new PropertyValueFactory<>("score"));
        evaluationDateColumnEvo.setCellValueFactory(new PropertyValueFactory<>("evaluationDate"));

        // Read binary data using databaseAccessor
        submissionList = databaseAccessor.readObject("CandidateAnswers.bin");
        evaluationList = databaseAccessor.readObject("Evaluations.bin");

        // Populate TableViews
        submissionTableView.setItems(submissionList);
        evaluationTable.setItems(evaluationList);

        // Populate answer field automatically when a candidate row is clicked in the table
        submissionTableView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        answerAreaTF.setText(newSelection.getAnswersText());
                    }
                }
        );
    }

    // Submit Evaluation Event Handler
    @javafx.fxml.FXML
    public void submitEvaluationBtnOnAction(ActionEvent actionEvent) {

        // Verify a row is selected from the upper submission table
        CandidateAnswer selectedSubmission = submissionTableView.getSelectionModel().getSelectedItem();

        if (selectedSubmission == null) {
            AlertGenerator.showWarningAlert("Selection Error", "Please select a candidate submission from the table.");
            successStatusLabel.setText("Success Status: Select a submission first");
            return;
        }

        // Validate Score Field
        if (scoreFieldTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please enter a score.");
            successStatusLabel.setText("Success Status: Enter Score");
            return;
        }

        double score;
        try {
            score = Double.parseDouble(scoreFieldTF.getText());
        } catch (NumberFormatException e) {
            AlertGenerator.showWarningAlert("Input Error", "Score must be a valid number.");
            successStatusLabel.setText("Success Status: Score must be numeric");
            return;
        }

        // Validate Remarks Field
        if (remarksAreaTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Validation Error", "Please enter remarks.");
            successStatusLabel.setText("Success Status: Enter Remarks");
            return;
        }

        // Calculate sample percentage & grade based on score out of 100
        double percentage = score;
        String grade = (score >= 80) ? "A" : (score >= 60) ? "B" : "C";

        // Create new Evaluation object matching your exact constructor:
        // Evaluation(candidateName, assessmentName, score, percentage, grade, evaluationDate, status, remarks)
        Evaluation newEvaluation = new Evaluation(
                selectedSubmission.getCandidateName(),
                selectedSubmission.getAssessmentName(),
                score,
                percentage,
                grade,
                "2026-08-08",
                "Evaluated",
                remarksAreaTF.getText()
        );

        // Add to evaluation list and save to binary file
        evaluationList.add(newEvaluation);
        databaseAccessor.writeObject("Evaluations.bin", evaluationList);

        // UI success updates
        successStatusLabel.setText("Success Status: Evaluation Submitted Successfully");
        AlertGenerator.showInformationAlert("Success", "Candidate evaluation submitted successfully.");

        // Clear text input fields
        scoreFieldTF.clear();
        answerAreaTF.clear();
        remarksAreaTF.clear();
        submissionTableView.getSelectionModel().clearSelection();
    }

    // Back to Dashboard Event Handler
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/SkillAssesmentOfficerDashboardView.fxml"
        );
    }
}
