package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.RecruitmentForecast;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class RecruitmentForecastController {

    @javafx.fxml.FXML
    private TableView<RecruitmentForecast> foreCastTableView;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentForecast, Integer> yeArTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentForecast, Double> growthRateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentForecast, String> recomMendationTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> forecastPeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentForecast, Integer> expectedVacanciesTableColumn;

    private ObservableList<RecruitmentForecast> forecastList;

    @javafx.fxml.FXML
    public void initialize(){
        forecastPeriodComboBox.getItems().addAll(
                "2026",
                "2027",
                "2028",
                "2029",
                "2030"
        );

        yeArTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("year")
        );
        expectedVacanciesTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("expectedVacancies")
        );
        growthRateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("growthRate")
        );
        recomMendationTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("recommendation")
        );

        forecastList = databaseAccessor.readObject("RecruitmentForecast.bin");
        foreCastTableView.setItems(forecastList);
    }

    @javafx.fxml.FXML
    public void onExportForecast(ActionEvent actionEvent) {
        if (foreCastTableView.getItems().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "No Data",
                    "There is no forecast report to export."
            );
            return;
        }

        databaseAccessor.writeObject(
                "RecruitmentForecastReport.bin",
                forecastList
        );

        AlertGenerator.showInformationAlert(
                "Export Successful",
                "Recruitment forecast exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void onGenerateForecast(ActionEvent actionEvent) {
        if (forecastPeriodComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Forecast Period Required",
                    "Please select a forecast period."
            );
            return;
        }

        forecastList = databaseAccessor.readObject("RecruitmentForecast.bin");
        foreCastTableView.setItems(forecastList);

        AlertGenerator.showInformationAlert(
                "Forecast Generated",
                "Recruitment forecast generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml");
    }
}
