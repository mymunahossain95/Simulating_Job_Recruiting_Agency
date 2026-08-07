package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import nonuser.PaymentVerification;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

public class PaymentVerificationController {

    @javafx.fxml.FXML
    private TableView<PaymentVerification>paymentInfoTable;

    @javafx.fxml.FXML
    private TableColumn<PaymentVerification,String> paymentIdColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentVerification,String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentVerification,String> amountColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentVerification,String> paymentTypeColumn;

    @javafx.fxml.FXML
    private TableColumn<PaymentVerification,String> statusColumn;

    @javafx.fxml.FXML
    private TextField remarksField;

    @javafx.fxml.FXML
    private Label verificationStatusLabel;


    @javafx.fxml.FXML
    public void initialize() {

        verificationStatusLabel.setText("Not Verified");

    }


    @javafx.fxml.FXML
    public void onVerify(ActionEvent actionEvent) {

        if (paymentInfoTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Payment Verification",
                    "Please select a payment first."
            );

            return;
        }

        if (remarksField.getText().trim().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Remarks",
                    "Please enter remarks."
            );

            return;
        }

        verificationStatusLabel.setText("Verified");

        AlertGenerator.showInformationAlert(
                "Verification",
                "Payment eligibility verified successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) {

      //  SceneSwitchingHelper.switchScene(
        //        actionEvent,
          //      "/FinanceOfficer/FinanceOfficerDashboard.fxml"
       // );
    //}
}