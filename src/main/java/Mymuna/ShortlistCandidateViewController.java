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

public class ShortlistCandidateViewController {

    @javafx.fxml.FXML
    private Label statusForShortlistCandidateLabel;

    @javafx.fxml.FXML
    private TextField candidateNameTF;

    @javafx.fxml.FXML
    private TextField candidateIdTF;


    @javafx.fxml.FXML
    public void shortlistCandidateOA(ActionEvent actionEvent) {

        if (candidateIdTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter Candidate ID.");
            return;
        }

        if (candidateNameTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter Candidate Name."
            );
            return;
        }


        Candidate candidate = new Candidate(
                candidateIdTF.getText(),
                candidateNameTF.getText(),
                "",
                "",
                "",
                "",
                "",
                "",
                "Shortlisted",
                "",
                0
        );


        ObservableList<Candidate> candidateList =
                databaseAccessor.readObject(
                        "ShortlistedCandidate.bin"
                );

        if (candidateList == null) {
            candidateList =
                    FXCollections.observableArrayList();
        }


        candidateList.add(candidate);


        databaseAccessor.writeObject(
                "ShortlistedCandidate.bin",
                candidateList
        );


        statusForShortlistCandidateLabel.setText(
                "Candidate Shortlisted Successfully"
        );

        AlertGenerator.showInformationAlert(
                "Success",
                "Candidate shortlisted successfully."
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/EmployerDashboardView.fxml"
        );
    }
}