package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.ResumeReview;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CareerCounselorResumeReviewController {

    @javafx.fxml.FXML
    private TableColumn<ResumeReview,String> statusCol4;
    @javafx.fxml.FXML
    private TableColumn<ResumeReview,String>  resumeIDCol1;
    @javafx.fxml.FXML
    private TableColumn<ResumeReview,String>  candidateNameCol2;
    @javafx.fxml.FXML
    private TableColumn<ResumeReview,String>  uploadDateCol3;
    @javafx.fxml.FXML
    private TableView<ResumeReview>  fromUploadedResumeTableView;
    private ObservableList<ResumeReview> resumeList;


    @javafx.fxml.FXML
    public void initialize() {
        resumeIDCol1.setCellValueFactory( new PropertyValueFactory<>("resumeID") );
        candidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName") );
        uploadDateCol3.setCellValueFactory( new PropertyValueFactory<>("uploadDate") );
        statusCol4.setCellValueFactory( new PropertyValueFactory<>("status") );
        resumeList = databaseAccessor.readObject("ResumeReview.bin");
        fromUploadedResumeTableView.setItems(resumeList);



    }

    @javafx.fxml.FXML
    public void handleAnalyzeResumeButtonOnAction(ActionEvent actionEvent) {
        if (fromUploadedResumeTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No candidate resume is available." );
            return;
        }
        AlertGenerator.showInformationAlert( "Resume Analysis", "Resume format, education, skills, experience and presentation reviewed successfully." );
    }

    @javafx.fxml.FXML
    public void handleViewResumeButtonOnAction(ActionEvent actionEvent) {
        if (fromUploadedResumeTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No candidate resumes are available." );
            return;
        }
        AlertGenerator.showInformationAlert( "Resume", "Candidate resume loaded successfully." );
    }



    @javafx.fxml.FXML
    public void handleSendFeedbackButtonOnAction(ActionEvent actionEvent) {
        if (fromUploadedResumeTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No candidate resume is available." );
            return;
        }
        databaseAccessor.writeObject( "ResumeReview.bin", resumeList );
        AlertGenerator.showInformationAlert( "Feedback Sent", "Resume Feedback Sent Successfully." );
    }

    @javafx.fxml.FXML
    public void handleHomeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/com.example.simulating_job_recruiting_agency/CareerCounselor/CareerCounselorDashboard.fxml" );
    }
}
