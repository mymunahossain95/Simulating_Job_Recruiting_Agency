package Ridwan;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

public class SkillAssesmentOfficerDashboardViewController {
    @javafx.fxml.FXML
    public void publishAssessmentResultbtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/PublishAssessmentResultView.fxml");
    }

    @javafx.fxml.FXML
    public void assignSkillTestBtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/AssignSkillTestView.fxml");
    }

    @javafx.fxml.FXML
    public void createAssessmentTestbtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/CreateAssessmentTestView.fxml");
    }

    @javafx.fxml.FXML
    public void generateSkillScorebtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/GenerateSkillScoreView.fxml");
    }

    @javafx.fxml.FXML
    public void viewPerformanceReportsbtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/ViewPerformanceReportsView.fxml");
    }

    @javafx.fxml.FXML
    public void recommendTrainingProgrambtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/RecommendTrainingProgramView.fxml");
    }

    @javafx.fxml.FXML
    public void updateAssessmentCriteriabtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/UpdateAssessmentCriteriaView.fxml");
    }

    @javafx.fxml.FXML
    public void evaluateCandidateAnsBtnOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/SkillAssessmentOfficer/EvaluateCandidateAnswersView.fxml");
    }
}
