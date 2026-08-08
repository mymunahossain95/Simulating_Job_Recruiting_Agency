package Utsita;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;


public class ReportAnalyticsDashboardController {
    @javafx.fxml.FXML
    public void onInterviewAnalytics(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/InterviewAnalytics.fxml");
    }

    @javafx.fxml.FXML
    public void onRecruitmentPerformance(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/RecruitmentPerformance.fxml");
    }

    @javafx.fxml.FXML
    public void onRecruitmentForecast(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/RecruitmentForecast.fxml");
    }

    @javafx.fxml.FXML
    public void onVacancyAnalysis(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "" +
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/VacancyAnalysis.fxml");
    }

    @javafx.fxml.FXML
    public void onHiringTrends(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/HiringTrends.fxml");
    }

    @javafx.fxml.FXML
    public void onSkillDemand(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/SkillDemand.fxml");
    }

    @javafx.fxml.FXML
    public void onPlacementStatistics(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/PlacementStatistics.fxml");
    }

    @javafx.fxml.FXML
    public void onCandidateFeedback(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/com.example.simulating_job_recruiting_agency/ReportsAndAnalyticsManager/CandidateFeedback.fxml");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/commonDashboard.fxml"
        );
    }
}
