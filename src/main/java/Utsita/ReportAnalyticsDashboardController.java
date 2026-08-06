package Utsita;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class ReportAnalyticsDashboardController {
    @javafx.fxml.FXML
    public void onInterviewAnalytics(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/InterviewAnalytics.fxml");
    }

    @javafx.fxml.FXML
    public void onRecruitmentPerformance(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onRecruitmentForecast(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onVacancyAnalysis(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onHiringTrends(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSkillDemand(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onPlacementStatistics(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/PlacementStatistics.fxml");
    }

    @javafx.fxml.FXML
    public void onCandidateFeedback(ActionEvent actionEvent) {
    }
}
