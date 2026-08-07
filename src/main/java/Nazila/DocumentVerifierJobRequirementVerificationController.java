package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.AvailableJob;
import nonuser.Candidate;

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

    @javafx.fxml.FXML
    public void handleVerifyRequirementsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCheckEligibilityButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
    }
}
