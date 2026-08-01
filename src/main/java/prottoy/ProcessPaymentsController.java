package prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProcessPaymentsController {
    @javafx.fxml.FXML
    private TableColumn methodColumn;
    @javafx.fxml.FXML
    private TableView approvedPaymentTable;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn paymentIdColumn;
    @javafx.fxml.FXML
    private Label paymentStatusLabel;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onProcessPayment(ActionEvent actionEvent) {
    }
}
