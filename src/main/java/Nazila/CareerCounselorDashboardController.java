package Nazila;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CareerCounselorDashboardController {
    @javafx.fxml.FXML
    public void handleCareerGuidanceButton(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G1_CareerGuidance_CareerCounselorView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleTrainingRecommendationsButton(ActionEvent actionEvent)throws IOException {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G5_TrainingRecommendations_CareerCounselorView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleJobMatchingButton(ActionEvent actionEvent) throws IOException{
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G4_JobMatching_CareerCounselorView.fxml",
                loggedInUser
        );
    }


    @javafx.fxml.FXML
    public void handleAssistanceRequestsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G2_AssistanceRequest_CareerCounselorView.fxml",
                loggedInUser
        );
    }


    @javafx.fxml.FXML
    public void handleCounselingSessionsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G3_CounselingSession_CareerCounselorView.fxml",
                loggedInUser
        );
    }



    @javafx.fxml.FXML
    public void handleCandidateTrackingButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G8_CandidateTracking_CareerCounselorView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleInterviewGuidanceButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G7_InterviewGuidance_CareerCounselorView.fxml",
                loggedInUser
        );
    }

    @javafx.fxml.FXML
    public void handleResumeReviewButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/G6_ResumeReview_CareerCounselorView.fxml",
                loggedInUser
        );
    }
}
