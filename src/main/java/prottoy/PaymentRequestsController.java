package prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PaymentRequestsController {
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn requestDateColumn;
    @javafx.fxml.FXML
    private TableView paymentRequestTable;
    @javafx.fxml.FXML
    private TableColumn candidateIdColumn;
    @javafx.fxml.FXML
    private TableColumn candidateNameColumn;
    @javafx.fxml.FXML
    private TableColumn requestIdColumn;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onViewDetails(ActionEvent actionEvent) {
    }
}
