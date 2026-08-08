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

import java.util.ArrayList;

public class ShortlistCandidateViewController {

    @javafx.fxml.FXML
    private Label statusForShortlistCandidateLabel;

    @javafx.fxml.FXML
    private TextField candidateNameTF;

    @javafx.fxml.FXML
    private TextField candidateIdTF;


    @javafx.fxml.FXML
    public void shortlistCandidateOA(ActionEvent actionEvent) {

        if (candidateIdTF.getText().isEmpty()
                || candidateNameTF.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please enter Candidate ID and Candidate Name."
            );

            return;
        }

        int candidateId;

        try {
            candidateId = Integer.parseInt(
                    candidateIdTF.getText()
            );
        } catch (NumberFormatException e) {

            AlertGenerator.showWarningAlert(
                    "Invalid Candidate ID",
                    "Candidate ID must be a number."
            );

            return;
        }

        Candidate candidate = new Candidate(
                candidateId,
                candidateNameTF.getText(),
                "",
                "",
                "",
                new ArrayList<String>(),
                ""
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
                "/Employer/EmployerDashboardView.fxml"
        );
    }
}