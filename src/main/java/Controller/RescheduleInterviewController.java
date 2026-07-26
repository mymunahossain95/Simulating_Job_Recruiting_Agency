package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RescheduleInterviewController {
    @javafx.fxml.FXML
    private TableColumn interviewIdColumn;
    @javafx.fxml.FXML
    private DatePicker newDatePicker;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private ComboBox newTimeComboBox;
    @javafx.fxml.FXML
    private TableView interviewTable;

    @javafx.fxml.FXML
    public void updateBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtnOnAction(ActionEvent actionEvent) {
    }
}
