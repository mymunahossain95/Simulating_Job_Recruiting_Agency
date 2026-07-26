package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TransactionRecordsController {
    @javafx.fxml.FXML
    private TableColumn transactionIdColumn;
    @javafx.fxml.FXML
    private TableView transactionTable;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private Label updateStatusLabel;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn paymentMethodColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TableColumn candidateIdColumn;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onUpdateRecord(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSaveRecord(ActionEvent actionEvent) {
    }
}
