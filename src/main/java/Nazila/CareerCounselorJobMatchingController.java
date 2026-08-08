package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.AvailableJob;
import nonuser.Candidate;
import nonuser.CounselingSession;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

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
    //eikhane theke table 2 for avaialblejob
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

    private ObservableList<Candidate> candidateList;
    private ObservableList<AvailableJob> availableJobList;

    @javafx.fxml.FXML
    public void initialize() {
        candidateIDCol1.setCellValueFactory( new PropertyValueFactory<>("candidateID") );
        skillsCol3.setCellValueFactory( new PropertyValueFactory<>("skills") );
        companyNameCol2.setCellValueFactory( new PropertyValueFactory<>("companyName") );
        jobTitleCol1.setCellValueFactory( new PropertyValueFactory<>("jobTitle") );
        candidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName") );
        requiredSkillsCol3.setCellValueFactory( new PropertyValueFactory<>("requiredSkills") );
        locationCol4.setCellValueFactory( new PropertyValueFactory<>("location") );
        candidateList = databaseAccessor.readObject("Candidate.bin");
        availableJobList = databaseAccessor.readObject("AvailableJob.bin");
        candidateListTableView.setItems(candidateList);
        availableJobsTableView.setItems(availableJobList);


    }

    @javafx.fxml.FXML
    public void handleSendRecommendationButtonOA(ActionEvent actionEvent) {
        if (candidateListTableView.getItems().isEmpty() || availableJobsTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "Candidate and job information must be available." );
            return;
        }
        databaseAccessor.writeObject("AvailableJob.bin", availableJobList);
        AlertGenerator.showInformationAlert( "Recommendation Sent", "Job Recommendations Sent Successfully." );

    }

    @javafx.fxml.FXML
    public void handleAnalyzeMatchButtonOA(ActionEvent actionEvent) {
        if (candidateListTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No candidate information is available." );
            return;
        }
        if (availableJobsTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No available jobs are available." );
            return;
        } AlertGenerator.showInformationAlert( "Match Analysis", "Candidate skills have been compared with available job requirements." );
    }

    @javafx.fxml.FXML
    public void handleRecommendJobButtonOA(ActionEvent actionEvent) {
        if (candidateListTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No candidate information is available." );
            return;
        } if (availableJobsTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "Invalid Input", "No available jobs are available." );
            return;
        } AlertGenerator.showInformationAlert( "Job Recommendation", "Suitable job selected for recommendation." );
    }



    @javafx.fxml.FXML
    public void handleHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/Nazila/CareerCounselorDashboard.fxml" );
    }
}
