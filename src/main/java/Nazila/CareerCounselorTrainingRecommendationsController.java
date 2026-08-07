package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.ResumeReview;
import nonuser.TrainingCourse;

public class CareerCounselorTrainingRecommendationsController {
    @javafx.fxml.FXML
    private TableView<TrainingCourse> trainingCoursesTableView;
    @javafx.fxml.FXML
    private Label candidateSkillsLabel;
    @javafx.fxml.FXML
    private TableColumn <TrainingCourse,String> courseNameCol1;
    @javafx.fxml.FXML
    private TableColumn <TrainingCourse,String>skillAreaCol4;
    @javafx.fxml.FXML
    private TableColumn<TrainingCourse,String> durationCol3;
    @javafx.fxml.FXML
    private TableColumn<TrainingCourse,String> trainingProviderCol2;




    @javafx.fxml.FXML
    public void handleViewSendRecommendButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewRecommendTrainingButtonnOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewCandidateSkillsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewHomeButtonOnAction(ActionEvent actionEvent) {
    }
}
