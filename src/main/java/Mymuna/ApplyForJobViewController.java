package Mymuna;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

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
    public void initialize() {

        availabilityToJoinCB.getItems().addAll(
                "Immediately",
                "Within 15 Days",
                "Within 1 Month",
                "More than 1 Month"
        );
    }

    @javafx.fxml.FXML
    public void submitApplicationOA(ActionEvent actionEvent) {

        if (jobIdTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter job ID.");
            return;
        }
        if (coverLetterTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter cover letter.");
            return;
        }
        if (availabilityToJoinCB.getValue() == null) {
            AlertGenerator.showWarningAlert("Missing Information", "Please select availability to join.");
            return;
        }
        statusForApplyForJobLabel.setText("Application Submitted Successfully");

        AlertGenerator.showInformationAlert("Application Submitted", "Application submitted successfully.");
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}