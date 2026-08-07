package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.HiringTrend;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class HiringTrendsController {

    @javafx.fxml.FXML
    private TableColumn<HiringTrend, String> indusTryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HiringTrend, String> hiringTrendTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HiringTrend, String> companyNameTableColumn;
    @javafx.fxml.FXML
    private DatePicker analysisDatePicker;
    @javafx.fxml.FXML
    private TableView<HiringTrend> hiringTrendTableView;
    @javafx.fxml.FXML
    private TableColumn<HiringTrend, Integer> vacanciesPostedTableColumn;

    private ObservableList<HiringTrend> hiringTrendList;

    @javafx.fxml.FXML
    public void initialize(){
        companyNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("companyName")
        );
        indusTryTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("industry")
        );
        vacanciesPostedTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("vacanciesPosted")
        );
        hiringTrendTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("hiringTrend")
        );

        hiringTrendList = databaseAccessor.readObject("HiringTrend.bin");
        hiringTrendTableView.setItems(hiringTrendList);
    }

    @javafx.fxml.FXML
    public void exportButton(ActionEvent actionEvent) {
        if(hiringTrendTableView.getItems().isEmpty()){
            AlertGenerator.showWarningAlert(
                    "No Data Found",
                    "No Report To Export"
            );
            return;
        }
        databaseAccessor.writeObject(
                "HiringTrendReport.bin",
                hiringTrendList
        );
        AlertGenerator.showInformationAlert(
                "Export Successful",
                "Report exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
        if(analysisDatePicker.getValue() == null){
            AlertGenerator.showWarningAlert(
                    "Date needed",
                    "Select an Analysis Date"
            );
            return;
        }
        hiringTrendList = databaseAccessor.readObject("HiringTrend.bin");
        hiringTrendTableView.setItems(hiringTrendList);

        AlertGenerator.showInformationAlert(
                "Report generated",
                "Report Generated Successfully"
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,"/ReportsAndAnalyticsManager/ReportAnalyticsDashBoard.fxml");
    }
}
