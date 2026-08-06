package Prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PaymentVerificationController {
    @javafx.fxml.FXML
    private TextField remarksField;
    @javafx.fxml.FXML
    private TableView paymentInfoTable;
    @javafx.fxml.FXML
    private TableColumn paymentTypeColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn paymentIdColumn;
    @javafx.fxml.FXML
    private Label verificationStatusLabel;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onVerify(ActionEvent actionEvent) {
    }
}
