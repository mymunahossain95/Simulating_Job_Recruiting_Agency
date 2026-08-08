package Mymuna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class ApplyForJobViewController {
    @javafx.fxml.FXML
    private TextField coverLetterTF;
    @javafx.fxml.FXML
    private Label statusForApplyForJobLabel;
    @javafx.fxml.FXML
    private ComboBox<String> availabilityToJoinCB;
    @javafx.fxml.FXML
    private TextField jobIdTF;
    @javafx.fxml.FXML

    private void initialize(){
        availabilityToJoinCB.getItems().addAll(
                "Immediately",
                "Within 15 Days",
                "Within 1 Month",
                "More than 1 Month"
        );
    }


    @javafx.fxml.FXML
    public void submitApplicationOA(ActionEvent actionEvent) {

        if (jobIdTF.getText().isEmpty()
                || coverLetterTF.getText().isEmpty()
                || availabilityToJoinCB.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all required fields."
            );

            return;
        }

        statusForApplyForJobLabel.setText(
                "Application Submitted Successfully"
        );

        AlertGenerator.showInformationAlert(
                "Application Submitted",
                "Application submitted successfully."
        );
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/JobSeeker/JobSeekerDashboardView.fxml"
        );

    }
}
