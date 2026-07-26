package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinancialComplianceController {
    @javafx.fxml.FXML
    private TableColumn ruleColumn;
    @javafx.fxml.FXML
    private TableColumn complianceIdColumn;
    @javafx.fxml.FXML
    private TableView complianceTable;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn reviewDateColumn;
    @javafx.fxml.FXML
    private TableColumn descriptionColumn;

    @javafx.fxml.FXML
    public void onGenerateComplianceReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onRefresh(ActionEvent actionEvent) {
    }
}
