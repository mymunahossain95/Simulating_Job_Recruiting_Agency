package Mymuna;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class JobSeekerDashboardViewController {
    @javafx.fxml.FXML
    public void viewJobOffersOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/JobOffersView.fxml");

    }

    @javafx.fxml.FXML
    public void attendInterviewOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/AttendInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void searchJobsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/SearchJobsView.fxml");
    }

    @javafx.fxml.FXML
    public void trackApplicationsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/TrackApplicationsView.fxml");
    }

    @javafx.fxml.FXML
    public void recommendedJobsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/RecommendedJobsView.fxml");
    }

    @javafx.fxml.FXML
    public void applyForJobOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/ApplyForJobView.fxml");
    }


    @javafx.fxml.FXML
    public void candidateProfileManagementOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/CandidateProfileManagementView.fxml");

    }

    @javafx.fxml.FXML
    public void candidateRegistrationOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/JobSeeker/RecommendedJobsView.fxml");
    }
}
