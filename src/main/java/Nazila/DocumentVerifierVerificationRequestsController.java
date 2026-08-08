package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.VerificationRequest;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

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

    private ObservableList<VerificationRequest> verifyingList;


    @javafx.fxml.FXML
    public void initialize() {
        verificationRequestRequestIDCol1.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        verificationRequestCandidateIDCol2.setCellValueFactory(new PropertyValueFactory<>("candidateId"));
        verificationRequestCandidateNameCol3.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        verificationRequestVerificationTypeCol4.setCellValueFactory(new PropertyValueFactory<>("verificationType"));
        verificationRequestStatusCol5.setCellValueFactory(new PropertyValueFactory<>("status"));


        verifyingList = databaseAccessor.readObject("VerificationRequest.bin");

        verificationRequestTableView.setItems(verifyingList);

    }


    @javafx.fxml.FXML
    public void verificationRequestProceedButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verificationRequestViewRequestButtonOnAction(ActionEvent actionEvent) {
        if (verificationRequestSearchForCandidateTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Name", "Please enter candidate name.");
            return;
        }
        if (!verificationRequestSearchForCandidateTextField.getText().equals("Is not Frpm A-Z")) {
            AlertGenerator.showWarningAlert("Invalid Name", "Candidate name can contain letters and spaces only.");
            return;
        }
        for (VerificationRequest verificationrequest : verifyingList) {
            if (verificationrequest.getCandidateName().equals(verificationRequestSearchForCandidateTextField.getText())) {
                AlertGenerator.showInformationAlert("Verification Request", "Candidate Name: " + verificationrequest.getCandidateName()+ "Status: " + verificationrequest.getStatus());
                return;
            }
        }
        AlertGenerator.showWarningAlert("Not Found", "Candidate not found.");
     }

    @javafx.fxml.FXML
    public void verificationReqcuestViewDetailsButtonOnAction(ActionEvent actionEvent) {
        if (verificationRequestSearchForCandidateTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Name", "Please enter candidate name.");
            return;
        }
        for (VerificationRequest request : verifyingList) {
            if (request.getCandidateName().equals(verificationRequestSearchForCandidateTextField.getText())) {
                AlertGenerator.showInformationAlert("Candidate Details", "Candidate Name: " + request.getCandidateName() + "\nCandidate ID: " + request.getCandidateId() + "\nVerification Type: " + request.getVerificationType() + "\nStatus: " + request.getStatus()
                );
                return;
            }
        }
        AlertGenerator.showWarningAlert("Not Found", "Candidate not found.");
    }

    @javafx.fxml.FXML
    public void verificationRequestGoBackButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/Nazila/DocumentVerifierDashboard.fxml"
        );
    }
}
