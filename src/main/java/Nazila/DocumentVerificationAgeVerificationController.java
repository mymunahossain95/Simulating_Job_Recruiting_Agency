package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

public class DocumentVerificationAgeVerificationController {
    @javafx.fxml.FXML
    private Label ageVerificationJobAgeRequirementLabel;
    @javafx.fxml.FXML
    private Label ageVerificationagAgeVerificationStatusLabel;
    @javafx.fxml.FXML
    private Label ageVerificationCandidateAgeLabel;


    @javafx.fxml.FXML
    public void handleageVerificationVerifyAgeButtonOnAction(ActionEvent actionEvent) {
        if (ageVerificationCandidateAgeLabel.getText().isEmpty() || ageVerificationJobAgeRequirementLabel.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Invalid Input", "Candidate age and job age requirement are required.");
            return;
        }
    }

    @javafx.fxml.FXML
    public void handleageVerificationCompareAgeButtonOnAction(ActionEvent actionEvent) {
        if (ageVerificationCandidateAgeLabel.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Invalid Input", "Candidate age is required.");
            return;

        } else if (ageVerificationJobAgeRequirementLabel.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Invalid Input", "Job age requirement is required.");
            return;

        } else if (Integer.parseInt(ageVerificationCandidateAgeLabel.getText()) <= 0) {
            AlertGenerator.showWarningAlert("Invalid Age", "Candidate age must be greater than 0.");
            return;

        } else if (Integer.parseInt(ageVerificationCandidateAgeLabel.getText())<=18) {
            AlertGenerator.showWarningAlert("Invalid Age", "Candidate age must be greater than 18.");
            return;

        } else if (Integer.parseInt(ageVerificationJobAgeRequirementLabel.getText())<=0) {
            AlertGenerator.showWarningAlert("Invalid Age", "Job age requirement must be greater than 0.");
            return;

        } else if (Integer.parseInt(ageVerificationCandidateAgeLabel.getText()) >= Integer.parseInt(ageVerificationJobAgeRequirementLabel.getText().trim())) {
            ageVerificationagAgeVerificationStatusLabel.setText("Eligible");
            AlertGenerator.showInformationAlert("Age Verified", "Candidate meets the age requirement."
            );

        } else {
            ageVerificationagAgeVerificationStatusLabel.setText("Not Eligible");
            AlertGenerator.showWarningAlert("Age Verification Failed", "Candidate does not meet the age requirement."
            );
        }
    }


    @javafx.fxml.FXML
    public void handleGoHomeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/com.example.simulating_job_recruiting_agency/DocumentVerifier/DocumentVerifierDashboard.fxml");
    }
}
