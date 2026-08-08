package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Candidate;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CareerCounselorCareerGuidanceController {

    @javafx.fxml.FXML
    private TextField searchCandidateNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> candidateIDCol1;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> skillsCol3;
    @javafx.fxml.FXML
    private Label educationDetailsLabel;
    @javafx.fxml.FXML
    private Label guidanceSummaryLabel;
    @javafx.fxml.FXML
    private Label skillInfoDetailsLabel;
    @javafx.fxml.FXML
    private Label experiencehistorLabel;
    @javafx.fxml.FXML
    private TableColumn <Candidate,String>candidateNameCol2;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> experienceCol4;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> educationCol5;

    private ObservableList<Candidate> candidateList;
    @javafx.fxml.FXML
    private TableView<Candidate> candidateInfoTableView;


    @javafx.fxml.FXML
    public void initialize(){
        candidateIDCol1.setCellValueFactory( new PropertyValueFactory<>("candidateID") );
        candidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName") );
        skillsCol3.setCellValueFactory( new PropertyValueFactory<>("skills") );
        experienceCol4.setCellValueFactory( new PropertyValueFactory<>("experience") );
        educationCol5.setCellValueFactory( new PropertyValueFactory<>("education") );
        candidateList = databaseAccessor.readObject("Candidate.bin");
        candidateInfoTableView.setItems(candidateList);
    }


    @javafx.fxml.FXML
    public void handleSaveGuidancecareerguideButton(ActionEvent actionEvent) {
        if(searchCandidateNameTextField.getText()==null||searchCandidateNameTextField.getText().isEmpty()){
            AlertGenerator.showWarningAlert( "Missing Information", "Enter candidate name or ID" );
            return;
        }
        AlertGenerator.showInformationAlert( "Search", "Candidate search completed" );
    }

    @javafx.fxml.FXML
    public void handlecareerguideSearchButton(ActionEvent actionEvent) {
        if(searchCandidateNameTextField.getText()==null||searchCandidateNameTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Enter candidate name or ID");
            return;
        }
    }

    @javafx.fxml.FXML
    public void handleViewProfilecareerguideButton(ActionEvent actionEvent) {
        educationDetailsLabel.setText("Education Details: Candidate information loaded");
        skillInfoDetailsLabel.setText("Skills Information: Candidate skills displayed");
        experiencehistorLabel.setText("Experience History: Candidate experience displayed");
        AlertGenerator.showInformationAlert("Profile", "Candidate profile displayed successfully"
        );

    }



    @javafx.fxml.FXML
    public void handleBacktoDashboardcareerguideButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/com.example.simulating_job_recruiting_agency/CareerCounselor/CareerCounselorDashboard.fxml");
    }
}
