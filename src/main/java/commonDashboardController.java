import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class commonDashboardController {
    @javafx.fxml.FXML
    public void user8Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/TrainingCoordinatorDashboard.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user9Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Admin/AdminDashboard.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user3Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/CareerCounselor/Dashboard_CareerCounselorView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user5Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/SkillAssessmentOfficer/SkillAssessmentOfficerDashboardView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user10Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Finance Officer/FinanceOfficerDashboard.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user7Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/RecruitmentAnalyticsManager/ReportAnalyticsDashboard.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user1Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user6Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/InterviewCoordinatorDashboard.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user2Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/Employer/EmployerDashboardView.fxml"
        );
    }

    @javafx.fxml.FXML
    public void user4Button(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/DocumentVerifier/Dashboard_DocumentVerifierView.fxml"
        );
    }
}
