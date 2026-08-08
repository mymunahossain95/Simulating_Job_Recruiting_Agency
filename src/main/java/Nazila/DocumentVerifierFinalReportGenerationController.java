package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Candidate;
import nonuser.VerificationRecord;
import nonuser.VerificationReport;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

import java.time.LocalDate;

public class DocumentVerifierFinalReportGenerationController {
    @javafx.fxml.FXML
    private Label reportGenerationReportGeneratedSuccessfullyLabel;
    @javafx.fxml.FXML
    private TableView<VerificationReport> EligibiltyRecordsTableView;
    @javafx.fxml.FXML
    private TableView <VerificationRecord>verificationDataTableView;
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
    private ObservableList<Candidate> candidateList;
    private ObservableList<VerificationRecord> verificationList;
    private ObservableList<VerificationReport> reportList;

    @javafx.fxml.FXML
    public void initialize() {
        CandidateIdCol1.setCellValueFactory( new PropertyValueFactory<>("candidateID"));
        candidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName"));
        finalStatusCol4.setCellValueFactory( new PropertyValueFactory<>("finalStatus"));
        verificationDataverificationTypeCol1.setCellValueFactory( new PropertyValueFactory<>("verificationType"));
        verifiactionDataStatusCol2.setCellValueFactory( new PropertyValueFactory<>("status"));
        eligibiltyRecorsdCandidateIdCol1.setCellValueFactory( new PropertyValueFactory<>("candidateId"));
        eligibiltyRecorsdappliedJobCol2.setCellValueFactory( new PropertyValueFactory<>("appliedJob"));
        eligibiltyRecorsdEligibility.setCellValueFactory( new PropertyValueFactory<>("eligibility"));
        eligibiltyRecordsfinalDecisionCol4.setCellValueFactory( new PropertyValueFactory<>("finalDecision"));
        candidateList = databaseAccessor.readObject("Candidate.bin");

        verificationList = databaseAccessor.readObject("VerificationRecord.bin");
        reportList = databaseAccessor.readObject("VerificationReport.bin");

        candidateRecordsTableView.setItems(candidateList);
        verificationDataTableView.setItems(verificationList);
        EligibiltyRecordsTableView.setItems(reportList);


    }

    @javafx.fxml.FXML
    public void reportGenerationSelectRecordButtonOA(ActionEvent actionEvent) {
        if (candidateList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Records", "No candidate records are available." );
            return;
        } if (verificationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Records", "No verification records are available." );
            return;
        }
        AlertGenerator.showInformationAlert( "Record Selected", "Candidate and verification records loaded successfully." );

    }

    @javafx.fxml.FXML
    public void reportGenerationGenerateReportButtonOA(ActionEvent actionEvent) {
        if (candidateList.isEmpty()) {
            AlertGenerator.showWarningAlert( "Missing Information", "No candidate record is available." );
            return;
        } if (verificationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "Missing Information", "No verification record is available." );
            return;
        }
        databaseAccessor.writeObject( "VerificationReport.bin", reportList ); reportGenerationReportGeneratedSuccessfullyLabel.setText( "Report Generated Successfully" );
        AlertGenerator.showInformationAlert( "Success", "Final verification report generated successfully." );
    }


    @javafx.fxml.FXML
    public void handleHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/com.example.simulating_job_recruiting_agency/DocumentVerifier/DocumentVerifierDashboard.fxml" );
    }
}
