package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import nonuser.VerificationRequest;

public class DocumentVerifierVerificationRequestsController {
    @javafx.fxml.FXML
    private Label vaerificationreqVerificationRequestDashboardLabel;
    @javafx.fxml.FXML
    private TableColumn <VerificationRequest, String>verificationRequestCandidateIDCol2;
    @javafx.fxml.FXML
    private TableColumn <VerificationRequest, String>verificationRequestCandidateNameCol3;
    @javafx.fxml.FXML
    private TableColumn<VerificationRequest, String> verificationRequestRequestIDCol1;
    @javafx.fxml.FXML
    private TableColumn<VerificationRequest, String> verificationRequestStatusCol5;
    @javafx.fxml.FXML
    private TextField verificationRequestSearchForCandidateTextField;
    @javafx.fxml.FXML
    private TableColumn<VerificationRequest, String> verificationRequestVerificationTypeCol4;
    @javafx.fxml.FXML
    private TableView<VerificationRequest> verificationRequestTableView;


    @javafx.fxml.FXML
    public void verificationRequestProceedButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verificationRequestViewRequestButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verificationRequestViewDetailsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verificationRequestGoBackButtonOnAction(ActionEvent actionEvent) {
    }
}
