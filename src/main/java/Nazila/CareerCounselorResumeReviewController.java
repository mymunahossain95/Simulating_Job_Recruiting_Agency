package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.ResumeReview;

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


    @javafx.fxml.FXML
    public void handleAnalyzeResumeButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewResumeButtonOnAction(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void handleSendFeedbackButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButtonOnAction(ActionEvent actionEvent) {
    }
}
