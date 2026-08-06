package Nazila;

import javafx.event.ActionEvent;

public class DocumentVerifierdashboardController {
    @javafx.fxml.FXML
    public void handleJobRequirementVerificationButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G5_JobRequirementVerification_DocumentVerifierView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleVerificationRequestsButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G4_VerificationRequests_DocumentVerifierView.fxml",
                loggedInUser
        );
    }


    @javafx.fxml.FXML
    public void handleEducationVerificationButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G4_EducationVerification_DocumentVerifierView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleIdentityVerificationButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G6_IdentityVerification_DocumentVerifierView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleAgeVerificationButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G3_AgeVerification_DocumentVerifierView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleFinalVerificationButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G7_FinalVerification_DocumentVerifierView.fxml",
                loggedInUser
        );
    }


    @javafx.fxml.FXML
    public void handleCandidateDocumentsButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G1_CandidateDocuments_DocumentVerifierView.fxml",
                loggedInUser
        );

    }

    @javafx.fxml.FXML
    public void handleFinalReportGenerationButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/DocumentVerifier/G8_FinalReportGeneration_DocumentVerifierView.fxml",
                loggedInUser
        );
    }
}
