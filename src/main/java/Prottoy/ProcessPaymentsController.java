package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.Payment;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

import java.io.IOException;

public class ProcessPaymentsController {
    @javafx.fxml.FXML
    private TableView<Payment> approvedPaymentTable;

    @javafx.fxml.FXML
    private TableColumn<Payment, String> paymentIdColumn;

    @javafx.fxml.FXML
    private TableColumn<Payment, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<Payment, Double> amountColumn;

    @javafx.fxml.FXML
    private TableColumn<Payment, String> methodColumn;

    @javafx.fxml.FXML
    private TableColumn<Payment, String> statusColumn;

    @javafx.fxml.FXML
    private Label paymentStatusLabel;

    private ObservableList<Payment> paymentList;


    @javafx.fxml.FXML
    public void initialize() {

        paymentIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("paymentId"));

        candidateColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidate"));

        amountColumn.setCellValueFactory(
                new PropertyValueFactory<>("amount"));

        methodColumn.setCellValueFactory(
                new PropertyValueFactory<>("method"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));


        paymentList =
                databaseAccessor.readObject("Payment.bin");

        if (paymentList == null) {
            paymentList = FXCollections.observableArrayList();
        }

        approvedPaymentTable.setItems(paymentList);

        paymentStatusLabel.setText("");
    }


    @javafx.fxml.FXML
    public void onProcessPayment(ActionEvent actionEvent) {

        Payment selectedPayment =
                approvedPaymentTable.getSelectionModel().getSelectedItem();

        if (selectedPayment == null) {

            AlertGenerator.showWarningAlert(
                    "Process Payment",
                    "Please select a payment first."
            );

            return;
        }

        paymentStatusLabel.setText(
                "Payment Processed"
        );

        AlertGenerator.showInformationAlert(
                "Payment Successful",
                "Payment processed successfully."
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