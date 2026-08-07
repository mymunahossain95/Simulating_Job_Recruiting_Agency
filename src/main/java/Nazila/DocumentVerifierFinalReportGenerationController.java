package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.Candidate;
import nonuser.VerificationRecord;
import nonuser.VerificationReport;

import java.time.LocalDate;

public class DocumentVerifierFinalReportGenerationController {
    @javafx.fxml.FXML
    private Label reportGenerationReportGeneratedSuccessfullyLabel;
    @javafx.fxml.FXML
    private TableView<VerificationReport> EligibiltyRecordsTableView;
    @javafx.fxml.FXML
    private TableView <VerificationReport>verificationDataTableView;
    @javafx.fxml.FXML
    private TableColumn <Candidate, String> CandidateIdCol1;
    @javafx.fxml.FXML
    private TableColumn<Candidate, String>  finalStatusCol4;
    @javafx.fxml.FXML
    private TableColumn <VerificationReport, String> appliedJobCol3;
    @javafx.fxml.FXML
    private TableColumn <Candidate, String>candidateNameCol2;
    @javafx.fxml.FXML
    private TableColumn <VerificationRecord, String>verifiactionDataStatusCol2;
    @javafx.fxml.FXML
    private TableView <Candidate>candidateRecordsTableView;
    @javafx.fxml.FXML
    private TableColumn <VerificationRecord, String>verificationDataverificationTypeCol1;
    @javafx.fxml.FXML
    private TableColumn<VerificationReport, String> eligibiltyRecorsdappliedJobCol2;
    @javafx.fxml.FXML
    private TableColumn<VerificationReport, String> eligibiltyRecorsdEligibility;
    @javafx.fxml.FXML
    private TableColumn<VerificationReport, String> eligibiltyRecordsfinalDecisionCol4;
    @javafx.fxml.FXML
    private TableColumn <VerificationReport, String>eligibiltyRecorsdCandidateIdCol1;


    @javafx.fxml.FXML
    public void reportGenerationSelectRecordButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportGenerationGenerateReportButtonOA(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void handleHomeButtonOA(ActionEvent actionEvent) {
    }
}
