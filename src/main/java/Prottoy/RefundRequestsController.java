package Prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import nonuser.Refund;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class RefundRequestsController {
    @javafx.fxml.FXML
    private TableColumn<Refund,String> reasonColumn;
    @javafx.fxml.FXML
    private TableColumn <Refund,String> statusColumn;
    @javafx.fxml.FXML
    private TableView <Refund> refundTable;
    @javafx.fxml.FXML
    private TableColumn <Refund,String> candidateColumn;
    @javafx.fxml.FXML
    private TableColumn <Refund,String> amountColumn;
    @javafx.fxml.FXML
    private Label refundStatusLabel;
    @javafx.fxml.FXML
    private TableColumn <Refund,String> refundIdColumn;

    @javafx.fxml.FXML
    public void onApproveRefund(ActionEvent actionEvent) {

        if (refundTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Approve Refund",
                    "Please select a refund request first."
            );

            return;
        }

        refundStatusLabel.setText("Refund Approved");

        AlertGenerator.showInformationAlert(
                "Success",
                "Refund request approved successfully."
        );
    }


    @javafx.fxml.FXML
    public void onRejectRefund(ActionEvent actionEvent) {

        if (refundTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Reject Refund",
                    "Please select a refund request first."
            );

            return;
        }

        refundStatusLabel.setText("Refund Rejected");

        AlertGenerator.showInformationAlert(
                "Success",
                "Refund request rejected successfully."
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
