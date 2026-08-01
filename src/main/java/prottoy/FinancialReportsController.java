package prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinancialReportsController {
    @javafx.fxml.FXML
    private TableView reportTable;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn reportIdColumn;
    @javafx.fxml.FXML
    private TableColumn generatedDateColumn;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn reportNameColumn;
    @javafx.fxml.FXML
    private TableColumn totalAmountColumn;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onDownloadReport(ActionEvent actionEvent) {
    }
}
