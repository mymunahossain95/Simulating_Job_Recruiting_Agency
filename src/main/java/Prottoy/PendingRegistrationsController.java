package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;

import nonuser.RegistrationRequest;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class PendingRegistrationsController {

    @javafx.fxml.FXML
    private TableView<RegistrationRequest> registrationTable;

    @javafx.fxml.FXML
    private TableColumn<RegistrationRequest, String> applicantIdColumn;

    @javafx.fxml.FXML
    private TableColumn<RegistrationRequest, String> nameColumn;

    @javafx.fxml.FXML
    private TableColumn<RegistrationRequest, String> emailColumn;

    @javafx.fxml.FXML
    private TableColumn<RegistrationRequest, String> statusColumn;

    private ObservableList<RegistrationRequest> registrationList;


    @javafx.fxml.FXML
    public void initialize() {

        applicantIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("applicantId"));

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("name"));

        emailColumn.setCellValueFactory(
                new PropertyValueFactory<>("email"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        registrationList =
                databaseAccessor.readObject("RegistrationRequest.bin");

        registrationTable.setItems(registrationList);
    }


    @javafx.fxml.FXML
    public void onApprove(ActionEvent event) {

        RegistrationRequest registration =
                registrationTable.getSelectionModel().getSelectedItem();

        if (registration == null) {

            AlertGenerator.showWarningAlert(
                    "Selection",
                    "Please select a registration."
            );

            return;
        }

        registration.setStatus("Approved");

        registrationTable.refresh();

        databaseAccessor.writeObject(
                "RegistrationRequest.bin",
                registrationList
        );

        AlertGenerator.showInformationAlert(
                "Approved",
                "Registration approved successfully."
        );
    }


    @javafx.fxml.FXML
    public void onReject(ActionEvent event) {

        RegistrationRequest registration =
                registrationTable.getSelectionModel().getSelectedItem();

        if (registration == null) {

            AlertGenerator.showWarningAlert(
                    "Selection",
                    "Please select a registration."
            );

            return;
        }

        registration.setStatus("Rejected");

        registrationTable.refresh();

        databaseAccessor.writeObject(
                "RegistrationRequest.bin",
                registrationList
        );

        AlertGenerator.showInformationAlert(
                "Rejected",
                "Registration rejected successfully."
        );
    }


    @javafx.fxml.FXML
    public void onViewDocument(ActionEvent event) {

        RegistrationRequest registration =
                registrationTable.getSelectionModel().getSelectedItem();

        if (registration == null) {

            AlertGenerator.showWarningAlert(
                    "Selection",
                    "Please select a registration."
            );

            return;
        }

        AlertGenerator.showInformationAlert(
                "Documents",
                "Applicant documents opened successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent event) {

        //SceneSwitchingHelper.switchScene(
                //event,
                //"/Admin/AdminDashboard.fxml"
        //);
    //}
}