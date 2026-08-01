package Ridwan;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.ActionEvent;

public class GenerateInterviewReportController {
    @javafx.fxml.FXML
    private TableView reportTable;
    @javafx.fxml.FXML
    private TableColumn statusColumn2;
    @javafx.fxml.FXML
    private TableColumn resultColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn candidateColumn;
    @javafx.fxml.FXML
    private TableColumn interviewDateColumn;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;

    @javafx.fxml.FXML
    public void generateBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtnOnAction(ActionEvent actionEvent) {
    }
}
