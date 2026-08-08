package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import nonuser.Candidate;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CandidateRegistrationViewController {

    @javafx.fxml.FXML
    private TextField nameTF;

    @javafx.fxml.FXML
    private TextField emailTF;

    @javafx.fxml.FXML
    private TextField confirmPasswordTF;

    @javafx.fxml.FXML
    private TextField passwordTF;

    @javafx.fxml.FXML
    private TextField phoneTF;

    @javafx.fxml.FXML
    private Label statusForCreateCandidateAccountLabel;


    @javafx.fxml.FXML
    public void registerOA(ActionEvent actionEvent) {

        if (nameTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter your name.");
            return;
        }

        if (emailTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter your email.");
            return;
        }
        if (phoneTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter your phone number.");
            return;
        }

        if (passwordTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter your password.");
            return;
        }

        if (confirmPasswordTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please confirm your password.");
            return;
        }

        if (!passwordTF.getText().equals(confirmPasswordTF.getText())) {
            AlertGenerator.showWarningAlert("Password Error", "Passwords do not match.");
            return;
        }

        if (!emailTF.getText().contains("@")) {
            AlertGenerator.showWarningAlert("Invalid Email", "Please enter a valid email.");
            return;
        }


        Candidate candidate = new Candidate(
                "C001",
                nameTF.getText(),
                "",
                "",
                "",
                emailTF.getText(),
                phoneTF.getText(),
                "",
                "Not Verified",
                "",
                0
        );


        ObservableList<Candidate> candidateList =
                databaseAccessor.readObject("Candidate.bin");

        if (candidateList == null) {
            candidateList =
                    FXCollections.observableArrayList();
        }

        candidateList.add(candidate);

        databaseAccessor.writeObject(
                "Candidate.bin",
                candidateList
        );


        statusForCreateCandidateAccountLabel.setText(
                "Account Created Successfully"
        );

        AlertGenerator.showInformationAlert(
                "Registration Successful",
                "Account Created Successfully"
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}