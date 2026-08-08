package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.VerificationRecord;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class DocumentVerifierFinalVerificationController {
    @javafx.fxml.FXML
    private Label fileVerificationFinalStatusLabel;
    @javafx.fxml.FXML
    private TableView <VerificationRecord>verificationSummaryTableView;
    @javafx.fxml.FXML
    private TableView <VerificationRecord>verificationResultTableView;
    @javafx.fxml.FXML
    private TableColumn<VerificationRecord, String> verificationResultsresultsCol2;
    @javafx.fxml.FXML
    private TableColumn <VerificationRecord, String>verificationSummaryverificationTypeCol1;
    @javafx.fxml.FXML
    private TableColumn<VerificationRecord, String> resultsCol21;
    @javafx.fxml.FXML
    private TableColumn<VerificationRecord, String> verificationSummaryverificationRemarksCol3;
    @javafx.fxml.FXML
    private TableColumn <VerificationRecord, String>verificationSummaryverificationStatusCol2;
    @javafx.fxml.FXML
    private TableColumn<VerificationRecord, String> verificationResultsverificationCol1;
    private ObservableList<VerificationRecord> verificationList;

    @javafx.fxml.FXML
    public void initialize() {
        verificationSummaryverificationTypeCol1.setCellValueFactory( new PropertyValueFactory<>("verificationType") );
        verificationSummaryverificationStatusCol2.setCellValueFactory( new PropertyValueFactory<>("status") );
        verificationSummaryverificationRemarksCol3.setCellValueFactory( new PropertyValueFactory<>("remarks") );
        verificationResultsverificationCol1.setCellValueFactory( new PropertyValueFactory<>("verificationType") );
        verificationResultsresultsCol2.setCellValueFactory( new PropertyValueFactory<>("results") );


        verificationList = databaseAccessor.readObject("VerificationRecord.bin");

        verificationSummaryTableView.setItems(verificationList);
        verificationResultTableView.setItems(verificationList);


    }
    @javafx.fxml.FXML
    public void handleFinalizeDecisionButtonOA(ActionEvent actionEvent) {
        if (verificationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Information", "No verification records are available." );
            return;
        }
        fileVerificationFinalStatusLabel.setText("Final Decision: Completed");
        AlertGenerator.showInformationAlert( "Finalized", "Final verification decision has been finalized." );
    }

    @javafx.fxml.FXML
    public void handleMarkNotEligibleButtonOA(ActionEvent actionEvent) {
        if (verificationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Information", "No verification records are available." );
            return;
        }
        fileVerificationFinalStatusLabel.setText("Final Decision: Not Eligible");
        AlertGenerator.showInformationAlert( "Not Eligible", "Candidate has been marked as not eligible." );
    }

    @javafx.fxml.FXML
    public void handleSaveDecisionButtonOA(ActionEvent actionEvent) {
        if (verificationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Information", "No verification records are available." );
            return;
        }
        databaseAccessor.writeObject( "VerificationRecord.bin", verificationList );
        AlertGenerator.showInformationAlert( "Saved", "Verification decision saved successfully." );

    }

    @javafx.fxml.FXML
    public void handleMarkEligibleButtonOA(ActionEvent actionEvent) {
        if (verificationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Information", "No verification records are available." );
            return;
        }
        fileVerificationFinalStatusLabel.setText("Final Decision: Eligible");
        AlertGenerator.showInformationAlert( "Eligible", "Candidate has been marked as eligible." );
    }

    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/com.example.simulating_job_recruiting_agency/DocumentVerifier/DocumentVerifierDashboard.fxml" );
    }
}
