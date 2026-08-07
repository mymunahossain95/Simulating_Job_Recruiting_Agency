package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import nonuser.EducationRecords;

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

    @javafx.fxml.FXML
    public void educationVerificationVerifyQualificationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void educationVerificationViewCertificateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGoHometButtonOnAction(ActionEvent actionEvent) {
    }
}
