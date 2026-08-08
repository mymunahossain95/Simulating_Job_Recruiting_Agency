package Utsita;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class TrainingCoordinatorDashboardController {
    @javafx.fxml.FXML
    public void attendanceButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/ManageTrainingAttendance.fxml");
    }

    @javafx.fxml.FXML
    public void assignCandidatesButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/AssignCandidates.fxml");
    }

    @javafx.fxml.FXML
    public void manageTrainingProgramsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/TrainingManagement.fxml");
    }

    @javafx.fxml.FXML
    public void certificateButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/IssueTrainingCertificates.fxml");
    }

    @javafx.fxml.FXML
    public void scheduleSessionsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/TrainingSchedule.fxml");
    }

    @javafx.fxml.FXML
    public void assignmentsButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/ManageTrainerAssignments.fxml");
    }

    @javafx.fxml.FXML
    public void monitorProgressButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/MonitorTrainingProgress.fxml");
    }

    @javafx.fxml.FXML
    public void evaluateButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/EvaluateTrainingEffectiveness.fxml");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/commonDashboard.fxml");
    }
}
