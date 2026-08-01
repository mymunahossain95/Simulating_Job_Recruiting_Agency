package Ridwan;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ScheduleInterviewController {
    @javafx.fxml.FXML
    private TableColumn interviewIdColumn;
    @javafx.fxml.FXML
    private ComboBox timeComboBox;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private TableView scheduleTable;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private ComboBox candidateComboBox;
    @javafx.fxml.FXML
    private ComboBox interviewerComboBox;
    @javafx.fxml.FXML
    private DatePicker interviewDatePicker;
    @javafx.fxml.FXML
    private TableColumn interviewerColumn;

    @javafx.fxml.FXML
    public void clearBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveBtnOnAction(ActionEvent actionEvent) {
    }
}
