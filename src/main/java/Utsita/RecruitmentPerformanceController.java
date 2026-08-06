package Utsita;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RecruitmentPerformanceController {

    @javafx.fxml.FXML
    private TableView recruitmentPerformanceTableView;
    @javafx.fxml.FXML
    private TableColumn successRateTableColumn;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker reportDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn recruitMentsTableColumn;
    @javafx.fxml.FXML
    private TableColumn departMentTableColumn;
    @javafx.fxml.FXML
    private TableColumn avgHiringTimeTableColumn;

    @javafx.fxml.FXML
    public void exportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
    }
}
