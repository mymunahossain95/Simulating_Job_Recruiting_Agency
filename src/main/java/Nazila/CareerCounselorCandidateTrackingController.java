package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.CandidateTracking;

import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

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

    private ObservableList<CandidateTracking> trackingList;



    @javafx.fxml.FXML
    public void initialize() {
        trackingInformationCandidateIDCol1.setCellValueFactory( new PropertyValueFactory<>("candidateID") );
        trackingInformationCandidateNameCol2.setCellValueFactory( new PropertyValueFactory<>("candidateName") );
        trackingInformationApplicationStatusCol3.setCellValueFactory( new PropertyValueFactory<>("applicationStatus") );
        trackingInformationInterviewStatusCol4.setCellValueFactory( new PropertyValueFactory<>("interviewStatus") );
        trackingInformationIPlacementStatusCol5.setCellValueFactory( new PropertyValueFactory<>("placementStatus") );

        trackingList = databaseAccessor.readObject( "CandidateTracking.bin" );

        trackingInformationTableView.setItems(trackingList);
    }

    @javafx.fxml.FXML
    public void handleSaveUpdateButtonOnAction(ActionEvent actionEvent) {
        if(trackingList==null||trackingList.isEmpty()){
            AlertGenerator.showWarningAlert("No Data", "There is no candidate tracking information to save.");
            return;
        }
        databaseAccessor.writeObject("CandidateTracking.bin", trackingList);

        AlertGenerator.showInformationAlert("Saved", "Update saved successfully.");


    }

    @javafx.fxml.FXML
    public void handleTrackProgressButtonOnAction(ActionEvent actionEvent) {
        if(trackingList==null||trackingList.isEmpty()){
            AlertGenerator.showWarningAlert("No Data", "No candidate tracking information available.");
            return;
        }
        trackingInformationTableView.setItems(trackingList);


        AlertGenerator.showInformationAlert("Progress", "Candidate progress loaded successfully.");

    }

    @javafx.fxml.FXML
    public void handleUpdateStatusButtonOnAction(ActionEvent actionEvent) {
        if(trackingList==null||trackingList.isEmpty()){
            AlertGenerator.showWarningAlert("Invalid Data", "No candidate status available to update.");
            return;
        }
        databaseAccessor.writeObject("CandidateTracking.bin", trackingList);
        AlertGenerator.showInformationAlert("Updated", "Candidate status updated successfully.");


    }

    @javafx.fxml.FXML
    public void handleHomeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene( actionEvent, "/Nazila/CareerCounselorDashboard.fxml" );
    }
}
