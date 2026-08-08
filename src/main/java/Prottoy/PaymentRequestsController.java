package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.PaymentRequest;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class PaymentRequestsController {

    @javafx.fxml.FXML
    private TableView<PaymentRequest> paymentRequestTable;

    @javafx.fxml.FXML
    private TableColumn<PaymentRequest, String> requestIdColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentRequest, String> candidateIdColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentRequest, String> candidateNameColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentRequest, String> amountColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentRequest, String> requestDateColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentRequest, String> statusColumn;

    private ObservableList<PaymentRequest> paymentRequestList;

    @javafx.fxml.FXML
    public void initialize() {

        requestIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("requestId"));

        candidateIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateId"));

        candidateNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName"));

        amountColumn.setCellValueFactory(
                new PropertyValueFactory<>("amount"));

        requestDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("requestDate"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        paymentRequestList =
                databaseAccessor.readObject("PaymentRequest.bin");

        if (paymentRequestList == null) {
            paymentRequestList = FXCollections.observableArrayList();
        }

        paymentRequestTable.setItems(paymentRequestList);
    }

    @javafx.fxml.FXML
    public void onViewDetails(ActionEvent actionEvent) {

        PaymentRequest selectedRequest =
                paymentRequestTable.getSelectionModel().getSelectedItem();

        if (selectedRequest == null) {

            AlertGenerator.showWarningAlert(
                    "View Details",
                    "Please select a payment request first."
            );

            return;
        }

        AlertGenerator.showInformationAlert(
                "Payment Request Details",
                "Payment request details opened successfully."
        );
    }

    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

      //  SceneSwitchingHelper.switchScene(
        //        actionEvent,
          //      "/FinanceOfficer/FinanceOfficerDashboard.fxml"
        //);
    //}
}
