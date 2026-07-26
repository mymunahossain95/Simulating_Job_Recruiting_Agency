package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ActivityLogsController {
    @javafx.fxml.FXML
    private DatePicker fromDate;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn userNameTableColumn;
    @javafx.fxml.FXML
    private TextField userIdField;
    @javafx.fxml.FXML
    private TableView activityTable;
    @javafx.fxml.FXML
    private TableColumn userIdTableColumn;
    @javafx.fxml.FXML
    private DatePicker toDate;
    @javafx.fxml.FXML
    private TableColumn activityIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn activityTableColumn;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn timeTableColumn;

    @javafx.fxml.FXML
    public void onFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }
}
