package Mymuna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import utility.SceneSwitchingHelper;


public class EmployerDashboardViewController {
    @javafx.fxml.FXML
    public void reviewApplicationsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/ReviewApplicationsView.fxml");
    }

    @javafx.fxml.FXML
    public void postJobVacancyOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/PostJobVacancyView.fxml");
    }

    @javafx.fxml.FXML
    public void recruitmentReportsOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/RecruitmentReportsView.fxml");
    }

    @javafx.fxml.FXML
    public void scheduleInterviewOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/ScheduleInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void hiringDecisionOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/HiringDecisionView.fxml");
    }

    @javafx.fxml.FXML
    public void shortlistCandidatesOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/ShortlistCandidateView.fxml");
    }

    @javafx.fxml.FXML
    public void companyRegistrationOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/CompanyRegistrationView.fxml");
    }

    @javafx.fxml.FXML
    public void viewJobVacancyOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/Employer/ViewJobVacancyView.fxml");
    }
}
