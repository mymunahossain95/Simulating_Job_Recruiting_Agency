package Utsitacontroller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RecruitmentForecastController {
    @javafx.fxml.FXML
    private TextField searchIndustryTextField;
    @javafx.fxml.FXML
    private ComboBox industRyComboBox;
    @javafx.fxml.FXML
    private TableView foreCastTableView;
    @javafx.fxml.FXML
    private TableColumn yeArTableColumn;
    @javafx.fxml.FXML
    private TableColumn industRyTableColumn;
    @javafx.fxml.FXML
    private TableColumn growthRateTableColumn;
    @javafx.fxml.FXML
    private TableColumn recomMendationTableColumn;
    @javafx.fxml.FXML
    private ComboBox forecastPeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn expectedVacanciesTableColumn;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onExportForecast(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onRefresh(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onGenerateForecast(ActionEvent actionEvent) {
    }
}
