package Utsita;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;


public class ReportAnalyticsDashboardController {
    @javafx.fxml.FXML
    public void onInterviewAnalytics(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/InterviewAnalytics.fxml");
    }

    @javafx.fxml.FXML
    public void onRecruitmentPerformance(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/RecruitmentPerformance.fxml");
    }

    @javafx.fxml.FXML
    public void onRecruitmentForecast(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/RecruitmentForecast.fxml");
    }

    @javafx.fxml.FXML
    public void onVacancyAnalysis(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/VacancyAnalysis.fxml");
    }

    @javafx.fxml.FXML
    public void onHiringTrends(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/HiringTrends.fxml");
    }

    @javafx.fxml.FXML
    public void onSkillDemand(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/SkillDemand.fxml");
    }

    @javafx.fxml.FXML
    public void onPlacementStatistics(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/PlacementStatistics.fxml");
    }

    @javafx.fxml.FXML
    public void onCandidateFeedback(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/CandidateFeedback.fxml");
    }
}
