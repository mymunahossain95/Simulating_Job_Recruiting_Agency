package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.RecruitmentPerformance;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class RecruitmentPerformanceController {

    @javafx.fxml.FXML
    private TableView<RecruitmentPerformance> recruitmentPerformanceTableView;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentPerformance, String> successRateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker reportDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentPerformance, Integer> recruitMentsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentPerformance, String> departMentTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RecruitmentPerformance, String> avgHiringTimeTableColumn;

    private ObservableList<RecruitmentPerformance> recruitmentPerformanceList;

    @javafx.fxml.FXML
    public void initialize(){
        reportTypeComboBox.getItems().addAll(
                "Monthly",
                "Yearly"
        );

        departMentTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("department")
        );
        recruitMentsTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("recruitments")
        );
        avgHiringTimeTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("averageHiringTime")
        );
        successRateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("successRate")
        );

        recruitmentPerformanceList =
                databaseAccessor.readObject("RecruitmentPerformance.bin");

        recruitmentPerformanceTableView.setItems(recruitmentPerformanceList);
    }

    @javafx.fxml.FXML
    public void exportButton(ActionEvent actionEvent) {
        if (recruitmentPerformanceTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "No Data",
                    "There is no report to export."
            );
            return;
        }

        databaseAccessor.writeObject(
                "RecruitmentPerformanceReport.bin",
                recruitmentPerformanceList
        );

        AlertGenerator.showInformationAlert(
                "Exported",
                "Performance Report exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {
        if (reportTypeComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Report Type Missing",
                    "Select a report type."
            );
            return;
        }
        if (reportDateDatePicker.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Date Missing",
                    "Select a report date."
            );
            return;
        }

        recruitmentPerformanceList = databaseAccessor.readObject("RecruitmentPerformance.bin");
        recruitmentPerformanceTableView.setItems(recruitmentPerformanceList);

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Recruitment Performance Report generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,"/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml");
    }
}
