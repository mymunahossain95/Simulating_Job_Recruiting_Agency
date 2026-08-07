package Nazila;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.AssistanceRequest;

import java.time.LocalDate;

public class CareerCounselorAssistanceRequestController {
    @javafx.fxml.FXML
    private Label careerCRequestDetailsLabel;
    @javafx.fxml.FXML
    private TableColumn<AssistanceRequest,String> requestTypeCol3;
    @javafx.fxml.FXML
    private ComboBox <String>requestTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<AssistanceRequest,String> requestIDCol1;
    @javafx.fxml.FXML
    private TableColumn<AssistanceRequest,String> candidateNameCol2;
    @javafx.fxml.FXML
    private TableView<AssistanceRequest> assistanceRequestTableView;
    @javafx.fxml.FXML
    private TableColumn<AssistanceRequest, LocalDate> submisionDateCol4;

    @javafx.fxml.FXML
    public void initialize() {

        requestTypeComboBox.getItems().addAll( "Career Advice", "Job Search Assistance", "CV Assistance", "Interview Preparation");
        requestIDCol1.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        candidateNameCol2.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        requestTypeCol3.setCellValueFactory(new PropertyValueFactory<>("requestType"));
        submisionDateCol4.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));


    }

    @javafx.fxml.FXML
    public void handleassistanceReqViewRequestButtononAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleassistanceReqSubmitResponseButtononAction(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void handleassistanceReqProcessReqButtononAction(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void handleBacktoDashboardButtononAction(ActionEvent actionEvent) {
    }
}
