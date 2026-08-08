package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Candidate;
import nonuser.EducationRecords;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class DocumentVerifierCandidateDocumentsView {
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> candidateListPhoneNumberCol4;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> candidateListEmailCol3;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> candidateListCandidateIDCol1;
    @javafx.fxml.FXML
    private TableColumn<Candidate,String> candidateListCandidateNameCol2;
    @javafx.fxml.FXML
    private TableView<Candidate> candidateListTableView;
    @javafx.fxml.FXML
    private TextField candidateSearchTextField;
    private ObservableList<Candidate> candidateList;



    @javafx.fxml.FXML
    public void initialize() {
        candidateListCandidateIDCol1.setCellValueFactory( new PropertyValueFactory<>("candidateID"));
        candidateListCandidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName"));
        candidateListEmailCol3.setCellValueFactory( new PropertyValueFactory<>("email"));
        candidateListPhoneNumberCol4.setCellValueFactory( new PropertyValueFactory<>("phoneNumber"));
        candidateList = databaseAccessor.readObject("Candidate.bin");
        candidateListTableView.setItems(candidateList);


    }

    @javafx.fxml.FXML
    public void candidateProfileSearchCandidateButtonOA(ActionEvent actionEvent) {
        if (candidateSearchTextField.getText()==null||candidateSearchTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert( "Missing Information", "Please enter Candidate ID or Candidate Name." );
            return;
        }for (Candidate candidate : candidateList) {
            if (candidate.getCandidateId().equals(candidateSearchTextField.getText()) || candidate.getCandidateName().equalsIgnoreCase(candidateSearchTextField.getText())) {
                candidateListTableView.getItems().clear();
                candidateListTableView.getItems().add(candidate);
                AlertGenerator.showInformationAlert("Candidate Found", "Candidate information loaded successfully.");
                return;
            }
        }
        AlertGenerator.showWarningAlert("Not Found", "No candidate found with this ID or name.");
    }

    @javafx.fxml.FXML
    public void candidateListViewButtonButtonOA(ActionEvent actionEvent) {
        if (candidateList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Information", "No candidate information is available." );
            return; }
        candidateListTableView.setItems(candidateList);
        AlertGenerator.showInformationAlert( "Candidate List", "Candidate list loaded successfully." );
    }

    @javafx.fxml.FXML
    public void candidateListProceedButtonOA(ActionEvent actionEvent) {
        if (candidateSearchTextField.getText()==null||candidateSearchTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert( "Missing Information", "Please enter Candidate ID or Candidate Name first." );
            return;
        } AlertGenerator.showInformationAlert( "Proceed", "Candidate document verification can now proceed." );
    }



    @javafx.fxml.FXML
    public void handleGoHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/Nazila/DocumentVerifierDashboard.fxml" );
    }
}
