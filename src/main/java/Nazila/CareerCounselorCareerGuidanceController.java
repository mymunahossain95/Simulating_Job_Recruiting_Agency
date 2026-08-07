package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import nonuser.Candidate;

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
    private TableView<Candidate> candidateInformationTableView;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> EducationCol5;
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
    public void handleSaveGuidancecareerguideButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlecareerguideSearchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewProfilecareerguideButton(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void handleBacktoDashboardcareerguideButton(ActionEvent actionEvent) {
    }
}
