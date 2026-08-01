package Prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RefundRequestsController {
    @javafx.fxml.FXML
    private TableColumn reasonColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableView refundTable;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private Label refundStatusLabel;
    @javafx.fxml.FXML
    private TableColumn refundIdColumn;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onRejectRefund(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onApproveRefund(ActionEvent actionEvent) {
    }
}
