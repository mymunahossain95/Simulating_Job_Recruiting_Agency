package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SendInterviewNotificationController {
    @javafx.fxml.FXML
    private TextField messageField;
    @javafx.fxml.FXML
    private TableColumn interviewIdColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn messageColumn;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private ComboBox interviewComboBox;
    @javafx.fxml.FXML
    private TableView notificationTableView;

    @javafx.fxml.FXML
    public void clearBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendBtnOnAction(ActionEvent actionEvent) {
    }
}
