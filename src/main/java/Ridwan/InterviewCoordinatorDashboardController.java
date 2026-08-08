package Ridwan;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class InterviewCoordinatorDashboardController {
    @javafx.fxml.FXML
    public void scheduleInterviewBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/ScheduleInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void genReportBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/GenerateReportView.fxml");
    }

    @javafx.fxml.FXML
    public void rescheduleInterviewBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/RescheduleInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void sendNotificationBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/SendNotificationView.fxml");
    }

    @javafx.fxml.FXML
    public void cancelInterviewBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/CancelInterviewView.fxml");
    }

    @javafx.fxml.FXML
    public void outcomeBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/FinalOutcomeView.fxml");
    }

    @javafx.fxml.FXML
    public void recAttendanceBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/RecordAttendanceView.fxml");
    }

    @javafx.fxml.FXML
    public void assignPanelBtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/InterviewCoordinator/AssignInterviewPanelView.fxml");
    }
}
