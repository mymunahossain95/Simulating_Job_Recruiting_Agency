package Mymuna;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class JobSeekerDashboardViewController {

    @javafx.fxml.FXML
    public void viewJobOffersOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/JobOffersView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void attendInterviewOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/AttendInterviewView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void searchJobsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/SearchJobsView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void trackApplicationsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/TrackApplicationsView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void recommendedJobsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/RecommendedJobsView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void applyForJobOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/ApplyForJobView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void candidateProfileManagementOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/CandidateProfileManagementView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void candidateRegistrationOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/CandidateRegistrationView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/commonDashboard.fxml");
    }
}