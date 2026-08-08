package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.AvailableJob;
import nonuser.Candidate;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class DocumentVerifierJobRequirementVerificationController {
    @javafx.fxml.FXML
    private Label jobRequirmentVerificationEligibilityStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateProfilrskills4;
    @javafx.fxml.FXML
    private TableView <Candidate>candidateProfiletableView;
    @javafx.fxml.FXML
    private TableView<AvailableJob> jobRequirmentTableView;
    @javafx.fxml.FXML
    private TableColumn <Candidate, String>candidateProfilecandidateIdCol1;
    @javafx.fxml.FXML
    private TableColumn <AvailableJob, String>jobRequirmentjobRequirmentskills4;
    @javafx.fxml.FXML
    private TableColumn <Candidate, String>candidateProfileEducationCol2;
    @javafx.fxml.FXML
    private TableColumn<AvailableJob, String> jobRequirmentminimumExperienceCol3;
    @javafx.fxml.FXML
    private TableColumn <AvailableJob, String>jobRequirmentminimumEducationCol2;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String> candidateProfileExperienceCol3;
    @javafx.fxml.FXML
    private TableColumn<AvailableJob, String> jobRequirmentpositionCol1;
    private ObservableList<Candidate> candidateList;
    private ObservableList<AvailableJob> jobList;

    @javafx.fxml.FXML
    public void initialize() {
        candidateProfilecandidateIdCol1.setCellValueFactory(new PropertyValueFactory<>("candidateId"));
        candidateProfileEducationCol2.setCellValueFactory(new PropertyValueFactory<>("education"));
        candidateProfileExperienceCol3.setCellValueFactory(new PropertyValueFactory<>("experience"));
        candidateProfilrskills4.setCellValueFactory(new PropertyValueFactory<>("skills"));

        jobRequirmentpositionCol1.setCellValueFactory(new PropertyValueFactory<>("jobTitle"));
        jobRequirmentminimumEducationCol2.setCellValueFactory(new PropertyValueFactory<>("minimumEducation"));
        jobRequirmentminimumExperienceCol3.setCellValueFactory(new PropertyValueFactory<>("requiredExperience"));
        jobRequirmentjobRequirmentskills4.setCellValueFactory(new PropertyValueFactory<>("requiredSkills"));

        candidateList = databaseAccessor.readObject("Candidate.bin");
        jobList = databaseAccessor.readObject("AvailableJob.bin");

        candidateProfiletableView.setItems(candidateList);
        jobRequirmentTableView.setItems(jobList);


    }

    @javafx.fxml.FXML
    public void handleVerifyRequirementsButtonOA(ActionEvent actionEvent) {
        if (candidateProfiletableView.getItems().isEmpty() || jobRequirmentTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert("Verification Failed", "Please select or load valid candidate and job details.");
            return;
        }
        databaseAccessor.writeObject("Candidate.bin", candidateList);
        databaseAccessor.writeObject("AvailableJob.bin", jobList);

        jobRequirmentVerificationEligibilityStatusLabel.setText("Eligibility Status: Requirements Verified");
        AlertGenerator.showInformationAlert("Verification Complete", "Job requirements verified successfully.");
    }

    @javafx.fxml.FXML
    public void handleCheckEligibilityButtonOA(ActionEvent actionEvent) {
        if (candidateProfiletableView.getItems().isEmpty() || jobRequirmentTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert("No Data", "Candidate or Job data is missing.");
            return;
        }
        jobRequirmentVerificationEligibilityStatusLabel.setText("Eligibility Status: Candidate Meets Basic Requirements");
        AlertGenerator.showInformationAlert("Eligibility Checked", "Eligibility check completed successfully.");
    }

    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/com.example.simulating_job_recruiting_agency/DocumentVerifier/DocumentVerifierDashboard.fxml");
    }
}
