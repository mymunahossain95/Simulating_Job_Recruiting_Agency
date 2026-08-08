package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.EducationRecords;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class DocumentVerificationEducationVerificationController {
    @javafx.fxml.FXML
    private Label educationVerificationQualificationStatusLabel;
    @javafx.fxml.FXML
    private TableColumn <EducationRecords,Integer>passingYearCol4;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,String> instituteCol3;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,String> statusCol4;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,Integer> certificateNoCol2;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,String> certificateTypeCol1;
    @javafx.fxml.FXML
    private TableView <EducationRecords>sscORhscCertificateTableView;
    @javafx.fxml.FXML
    private TableView <EducationRecords>educationVerificationRecordsTableView;
    @javafx.fxml.FXML
    private TableColumn <EducationRecords,String>BoardCol2;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,String> GroupCol3;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,String> examCol1;
    @javafx.fxml.FXML
    private TableColumn<EducationRecords,Float> gpaCol5;
    @javafx.fxml.FXML
    private TextField candidateVerificationRemarksTextField;
    private ObservableList<EducationRecords> educationList;


    @javafx.fxml.FXML
    public void initialize() {
        certificateTypeCol1.setCellValueFactory( new PropertyValueFactory<>("certificateType") );
        certificateNoCol2.setCellValueFactory( new PropertyValueFactory<>("certificateNo") );
        instituteCol3.setCellValueFactory( new PropertyValueFactory<>("institute") );
        passingYearCol4.setCellValueFactory( new PropertyValueFactory<>("passingYear") );
        statusCol4.setCellValueFactory( new PropertyValueFactory<>("status") );
        examCol1.setCellValueFactory( new PropertyValueFactory<>("exam") );
        BoardCol2.setCellValueFactory( new PropertyValueFactory<>("board") );
        GroupCol3.setCellValueFactory( new PropertyValueFactory<>("group") );
        gpaCol5.setCellValueFactory( new PropertyValueFactory<>("gpa") );
        educationList = databaseAccessor.readObject("EducationRecords.bin");
        educationVerificationRecordsTableView.setItems(educationList);
        sscORhscCertificateTableView.setItems(educationList);


    }
    @javafx.fxml.FXML
    public void educationVerificationVerifyQualificationButtonOnAction(ActionEvent actionEvent) {
        if (candidateVerificationRemarksTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert( "Missing Information", "Please enter verification remarks." );
            return;
        } else if (educationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Records", "No education records available." );
            return;
        } else if (educationList.get(0).getGpa()<2.0) { //eta abr check kora lagbe ki jani problem ase
            AlertGenerator.showWarningAlert( "Qualification Failed", "GPA must be at least 2.0." );
            return;
        } else { educationVerificationQualificationStatusLabel.setText( "Qualification Verified" );
            databaseAccessor.writeObject( "EducationRecords.bin", educationList );
            AlertGenerator.showInformationAlert( "Success", "Qualification verified successfully." );
        }
    }

    @javafx.fxml.FXML
    public void educationVerificationViewCertificateButtonOnAction(ActionEvent actionEvent) {
        if (educationList.isEmpty()) {
            AlertGenerator.showWarningAlert( "No Certificate", "No certificate is available." );
            return;
        } else { AlertGenerator.showInformationAlert( "Certificate", "Certificate details loaded successfully." );}
    }

    @javafx.fxml.FXML
    public void handleGoHometButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/com.example.simulating_job_recruiting_agency/DocumentVerifier/DocumentVerifierDashboard.fxml" );
    }
}
