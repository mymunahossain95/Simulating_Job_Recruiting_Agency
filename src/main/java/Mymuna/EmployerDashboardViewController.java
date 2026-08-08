package Mymuna;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class EmployerDashboardViewController {

    @javafx.fxml.FXML
    public void reviewApplicationsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/ReviewApplicationsView.fxml");
    }

    @javafx.fxml.FXML
    public void postJobVacancyOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/PostJobVacancyView.fxml");
    }

    @javafx.fxml.FXML
    public void recruitmentReportsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/RecruitmentReportsView.fxml");
    }

    @javafx.fxml.FXML
    public void scheduleInterviewOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/ScheduleInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void hiringDecisionOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/HiringDecisionView.fxml");
    }

    @javafx.fxml.FXML
    public void shortlistCandidatesOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/ShortlistCandidateView.fxml");
    }

    @javafx.fxml.FXML
    public void companyRegistrationOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/CompanyRegistrationView.fxml");
    }

    @javafx.fxml.FXML
    public void viewJobVacancyOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/ViewJobVacancyView.fxml");
    }

    @javafx.fxml.FXML
    public void backON(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/commonDashboard.fxml");
    }
}
