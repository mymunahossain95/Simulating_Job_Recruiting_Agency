package Utsitacontroller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RecruitmentPerformanceController {
    @javafx.fxml.FXML
    private DatePicker endDateDatePicker;
    @javafx.fxml.FXML
    private TableView recruitmentPerformanceTableView;
    @javafx.fxml.FXML
    private TableColumn costPerHireTableColumn;
    @javafx.fxml.FXML
    private TableColumn successRateTableColumn;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn recruitMentsTableColumn;
    @javafx.fxml.FXML
    private TableColumn departMentTableColumn;
    @javafx.fxml.FXML
    private TableColumn avgHiringTimeTableColumn;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onRefresh(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onExportPdf(ActionEvent actionEvent) {
    }
}
