package Nazila;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.CandidateTracking;
import nonuser.Interview;
import nonuser.JobApplication;

public class CareerCounselorCandidateTrackingController {
    @javafx.fxml.FXML
    private TableColumn<CandidateTracking,String> trackingInformationIPlacementStatusCol5;
    @javafx.fxml.FXML
    private TableColumn<CandidateTracking,String> trackingInformationCandidateNameCol2;
    @javafx.fxml.FXML
    private TableColumn<CandidateTracking,String> trackingInformationInterviewStatusCol4;
    @javafx.fxml.FXML
    private TableColumn <CandidateTracking,String> trackingInformationCandidateIDCol1;
    @javafx.fxml.FXML
    private TableView<CandidateTracking> trackingInformationTableView;
    @javafx.fxml.FXML
    private TableColumn <CandidateTracking,String>trackingInformationApplicationStatusCol3;

    @javafx.fxml.FXML
    public void handleSaveUpdateButtonOnAction(ActionEvent actionEvent) {



    }

    @javafx.fxml.FXML
    public void handleTrackProgressButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdateStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButtonOnAction(ActionEvent actionEvent) {
    }
}
