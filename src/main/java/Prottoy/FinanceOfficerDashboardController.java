package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class FinanceOfficerDashboardController {

    @javafx.fxml.FXML
    private Label welcomeLabel;


    @javafx.fxml.FXML
    public void initialize() {
        welcomeLabel.setText("Welcome Finance Officer");
    }

    @javafx.fxml.FXML
    public void onCompliance(ActionEvent actionEvent) throws IOException{
        SceneSwitchingHelper.switchScene(actionEvent, "/FinanceOfficer/FinancialCompliance.fxml");
    }

    @javafx.fxml.FXML
    public void onVerifyPayments(ActionEvent actionEvent) throws IOException{
        SceneSwitchingHelper.switchScene(actionEvent, "/FinanceOfficer/PaymentVerification.fxml");
    }

    @javafx.fxml.FXML
    public void onTransactions(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(actionEvent, "/FinanceOfficer/TransactionRecords.fxml");
    }


    @javafx.fxml.FXML
    public void onProcessPayments(ActionEvent actionEvent)throws IOException {
        SceneSwitchingHelper.switchScene(actionEvent, "/FinanceOfficer/ProcessCandidatePayments.fxml");
    }

    @javafx.fxml.FXML
    public void onFinancialReports(ActionEvent actionEvent) throws IOException{
        SceneSwitchingHelper.switchScene(actionEvent, "/FinanceOfficer/FinancialReports.fxml");
    }

    @javafx.fxml.FXML
    public void onPaymentRequests(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(actionEvent,"/FinanceOfficer/PaymentRequests.fxml");
    }

    @javafx.fxml.FXML
    public void onRefundRequests(ActionEvent actionEvent)throws IOException {
        SceneSwitchingHelper.switchScene(actionEvent, "/FinanceOfficer/RefundRequests.fxml");
    }
}
