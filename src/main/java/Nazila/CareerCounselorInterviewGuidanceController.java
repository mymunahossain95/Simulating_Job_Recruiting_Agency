package Nazila;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Candidate;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CareerCounselorInterviewGuidanceController {

    @javafx.fxml.FXML
    private TableColumn <Candidate,String>candidateIDCol1;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> candidateNameCol2;
    @javafx.fxml.FXML
    private TableView <Candidate>candidateListTableView;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> jobRoleCol3;

    private ObservableList<Candidate> candidateProfileList;


    @javafx.fxml.FXML public void initialize() {
        candidateIDCol1.setCellValueFactory( new PropertyValueFactory<>("candidateID") );
        candidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName") );
        jobRoleCol3.setCellValueFactory( new PropertyValueFactory<>("jobRole") );
        candidateProfileList = databaseAccessor.readObject("Candidate.bin");
        candidateListTableView.setItems(candidateProfileList);
    }


    @javafx.fxml.FXML
    public void handleShareMaterialsOnActionButton(ActionEvent actionEvent) {
        if (candidateListTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "No Candidate", "No candidate information is available." );
            return;
        }
        AlertGenerator.showInformationAlert( "Candidate Information", "Candidate information loaded successfully." );
    }

    @javafx.fxml.FXML
    public void handleProvideTipsOnActionButton(ActionEvent actionEvent) {
        if (candidateListTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert("No Candidate", "Please load candidate information first." );
            return;
        }
        AlertGenerator.showInformationAlert( "Interview Tips", "Review job requirements.\n" + "Practice common interview questions.\n" + "Improve communication skills.\n" + "Prepare for technical questions.\n" + "Practice mock interviews." );
    }


    @javafx.fxml.FXML
    public void handleViewCandidateButtonOnAction(ActionEvent actionEvent) {
        if (candidateListTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert( "No Candidate", "No candidate information is available." );
            return;
        }
        AlertGenerator.showInformationAlert( "Candidate Information", "Candidate information loaded successfully." );
    }


    @javafx.fxml.FXML
    public void handleHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/Nazila/CareerCounselorDashboard.fxml" );
    }
}
