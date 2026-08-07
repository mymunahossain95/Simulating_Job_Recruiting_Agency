package Utsita;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class TrainingCoordinatorDashboardController {
    @javafx.fxml.FXML
    public void attendanceButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/ManageTrainingAttendance.fxml");
    }

    @javafx.fxml.FXML
    public void assignCandidatesButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/AssignCandidates.fxml");
    }

    @javafx.fxml.FXML
    public void manageTrainingProgramsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/TrainingManagement.fxml");
    }

    @javafx.fxml.FXML
    public void certificateButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/IssueTrainingCertificates.fxml");
    }

    @javafx.fxml.FXML
    public void scheduleSessionsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/TrainingSchedule.fxml");
    }

    @javafx.fxml.FXML
    public void assignmentsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/ManageTrainerAssignments.fxml");
    }

    @javafx.fxml.FXML
    public void monitorProgressButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/MonitorTrainingProgress.fxml");
    }

    @javafx.fxml.FXML
    public void evaluateButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/EvaluateTrainingEffectiveness.fxml");
    }
}
