package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.VacancyAnalysis;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class VacancyAnalysisController {

    @javafx.fxml.FXML
    private TableColumn<VacancyAnalysis, String> statusTableColumn;
    @javafx.fxml.FXML
    private DatePicker analysisDatePicker;
    @javafx.fxml.FXML
    private TableView<VacancyAnalysis> vacancyAnalysisTableView;
    @javafx.fxml.FXML
    private TableColumn<VacancyAnalysis, String> jobTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VacancyAnalysis, Integer> daysRequiredTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VacancyAnalysis, String> compAnyTableColumn;

    private ObservableList<VacancyAnalysis> vacancyList;

    @javafx.fxml.FXML
    public void initialize(){
        jobTitleTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("jobTitle")
        );
        compAnyTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("company")
        );
        daysRequiredTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("daysRequired")
        );
        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );

        vacancyList = databaseAccessor.readObject("VacancyAnalysis.bin");
        vacancyAnalysisTableView.setItems(vacancyList);
    }

    @javafx.fxml.FXML
    public void exportButton(ActionEvent actionEvent) {
        if (vacancyAnalysisTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "No Data",
                    "There is no vacancy report to export."
            );
            return;
        }

        databaseAccessor.writeObject(
                "VacancyAnalysisReport.bin",
                vacancyList
        );

        AlertGenerator.showInformationAlert(
                "Export Successful",
                "Report exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
        if (analysisDatePicker.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Date Required",
                    "Please select an analysis date."
            );
            return;
        }
        vacancyList = databaseAccessor.readObject("VacancyAnalysis.bin");

        vacancyAnalysisTableView.setItems(vacancyList);

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Vacancy analysis report generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml");
    }
}
