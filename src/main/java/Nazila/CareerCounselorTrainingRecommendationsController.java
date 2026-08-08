package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.ResumeReview;
import nonuser.TrainingCourse;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

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

    private ObservableList<TrainingCourse> trainingCourseList;



    @javafx.fxml.FXML
    public void initialize() {
        courseNameCol1.setCellValueFactory( new PropertyValueFactory<>("courseName") );
        trainingProviderCol2.setCellValueFactory( new PropertyValueFactory<>("trainingProvider") );
        durationCol3.setCellValueFactory( new PropertyValueFactory<>("duration") );
        skillAreaCol4.setCellValueFactory( new PropertyValueFactory<>("skillArea") );

        trainingCourseList = databaseAccessor.readObject("TrainingCourse.bin");
        trainingCoursesTableView.setItems(trainingCourseList);


    }



    @javafx.fxml.FXML
    public void handleViewSendRecommendButtonOA(ActionEvent actionEvent) {
        if (trainingCoursesTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No training courses are available." ); return;
        }
        databaseAccessor.writeObject( "TrainingCourse.bin", trainingCourseList );
        AlertGenerator.showInformationAlert( "Saved", "Training recommendation saved successfully." );
    }

    @javafx.fxml.FXML
    public void handleViewRecommendTrainingButtonnOA(ActionEvent actionEvent) {
        if (trainingCoursesTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No training courses are available." );
            return;
        }
        databaseAccessor.writeObject( "TrainingCourse.bin", trainingCourseList );
        AlertGenerator.showInformationAlert( "Saved", "Training recommendation saved successfully." );
    }

    @javafx.fxml.FXML
    public void handleViewCandidateSkillsButtonOA(ActionEvent actionEvent) {
        if (trainingCoursesTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No training course information is available." );
            return;
        }
        candidateSkillsLabel.setText( "Candidate Skills:" + "Current skills and qualifications loaded successfully." );
        AlertGenerator.showInformationAlert( "Candidate Skills", "Candidate skills displayed successfully." );
    }

    @javafx.fxml.FXML
    public void handleViewHomeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/Nazila/CareerCounselorDashboard.fxml" );
    }
}
