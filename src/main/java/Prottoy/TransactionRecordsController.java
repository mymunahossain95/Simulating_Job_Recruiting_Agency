package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.Transaction;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class TransactionRecordsController {

    @javafx.fxml.FXML
    private TableView<Transaction> transactionTable;

    @javafx.fxml.FXML
    private TableColumn <Transaction,String>transactionIdColumn;

    @javafx.fxml.FXML
    private TableColumn<Transaction,String> candidateIdColumn;

    @javafx.fxml.FXML
    private TableColumn<Transaction,String> amountColumn;

    @javafx.fxml.FXML
    private TableColumn<Transaction,String> paymentMethodColumn;

    @javafx.fxml.FXML
    private TableColumn <Transaction,String> dateColumn;

    @javafx.fxml.FXML
    private TableColumn<Transaction,String> statusColumn;

    @javafx.fxml.FXML
    private Label updateStatusLabel;


    @javafx.fxml.FXML
    public void onUpdateRecord(ActionEvent actionEvent) {

        if (transactionTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Update Transaction",
                    "Please select a transaction record first."
            );

            return;
        }

        updateStatusLabel.setText("Record Updated");

        AlertGenerator.showInformationAlert(
                "Success",
                "Transaction record updated successfully."
        );
    }


    @javafx.fxml.FXML
    public void onSaveRecord(ActionEvent actionEvent) {

        if (transactionTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Save Transaction",
                    "Please select a transaction record first."
            );

            return;
        }

        updateStatusLabel.setText("Record Saved");

        AlertGenerator.showInformationAlert(
                "Success",
                "Transaction record saved successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

      //  SceneSwitchingHelper.switchScene(
        //        actionEvent,
               // "/FinanceOfficer/FinanceOfficerDashboard.fxml"
        //);
    //}
}