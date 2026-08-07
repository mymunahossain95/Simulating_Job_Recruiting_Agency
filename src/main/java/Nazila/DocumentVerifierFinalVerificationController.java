package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.VerificationRecord;

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

    @javafx.fxml.FXML
    public void handleFinalizeDecisionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkNotEligibleButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveDecisionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkEligibleButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
    }
}
