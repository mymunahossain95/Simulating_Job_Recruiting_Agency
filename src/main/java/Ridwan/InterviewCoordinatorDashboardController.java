package Ridwan;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class InterviewCoordinatorDashboardController {
    @javafx.fxml.FXML
    public void scheduleInterviewBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/ScheduleInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void genReportBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/GenerateReportView.fxml");
    }

    @javafx.fxml.FXML
    public void rescheduleInterviewBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/RescheduleInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void sendNotificationBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/SendNotificationView.fxml");
    }

    @javafx.fxml.FXML
    public void cancelInterviewBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/CancelInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void outcomeBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/FinalOutcomeView.fxml");
    }

    @javafx.fxml.FXML
    public void recAttendanceBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/RecordAttendanceView.fxml");
    }

    @javafx.fxml.FXML
    public void assignPanelBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/AssignInterviewPanelView.fxml");
    }

    @javafx.fxml.FXML
    public void backbtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/commonDashboard.fxml");
    }
}
