package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.AvailableJob;
import nonuser.Candidate;
import nonuser.CounselingSession;

public class CareerCounselorJobMatchingController {
    @javafx.fxml.FXML
    private Label jobMatchingvailableJobsLabel;
    @javafx.fxml.FXML
    private TableView <Candidate>candidateListTableView;
    @javafx.fxml.FXML
    private TableColumn <Candidate,String>candidateIDCol1;
    @javafx.fxml.FXML
    private TableColumn <Candidate,String> skillsCol3;
    @javafx.fxml.FXML
    private TableColumn <Candidate,String> companyNameCol2;
    //this is table 2 from avaialblejob
    @javafx.fxml.FXML
    private TableColumn<AvailableJob, String> locationCol4;
    @javafx.fxml.FXML
    private TableColumn <AvailableJob, String>candidateNameCol2;
    @javafx.fxml.FXML
    private TableView <AvailableJob>availableJobsTableView;
    @javafx.fxml.FXML
    private TableColumn <AvailableJob, String>requiredSkillsCol3;
    @javafx.fxml.FXML
    private TableColumn <AvailableJob,String>jobTitleCol1;


    @javafx.fxml.FXML
    public void handleSendRecommendationButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAnalyzeMatchButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRecommendJobButtonOA(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void handleHomeButtonOA(ActionEvent actionEvent) {
    }
}
