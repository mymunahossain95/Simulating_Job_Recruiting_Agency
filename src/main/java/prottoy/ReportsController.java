package prottoy;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ReportsController {
    @javafx.fxml.FXML
    private TableView reportTable;
    @javafx.fxml.FXML
    private TableColumn reportColumnTable;
    @javafx.fxml.FXML
    private DatePicker endDate;
    @javafx.fxml.FXML
    private ComboBox reportTypeCombo;
    @javafx.fxml.FXML
    private DatePicker startDate;

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }
}
