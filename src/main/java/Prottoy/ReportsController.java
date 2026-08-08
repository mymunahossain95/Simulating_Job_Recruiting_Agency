package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.SystemReport;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class ReportsController {

    @javafx.fxml.FXML
    private TableView<SystemReport> reportTable;

    @javafx.fxml.FXML
    private TableColumn<SystemReport, String> reportColumnTable;

    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCombo;

    @javafx.fxml.FXML
    private DatePicker endDate;

    @javafx.fxml.FXML
    private DatePicker startDate;

    @javafx.fxml.FXML
    private PieChart reportPieChart;

    private ObservableList<SystemReport> reportList;


    @javafx.fxml.FXML
    public void initialize() {

        // Report Types
        reportTypeCombo.getItems().addAll(
                "User Report",
                "Job Category Report",
                "Registration Report",
                "Complaint Report",
                "Activity Report"
        );

        // Table Column
        reportColumnTable.setCellValueFactory(
                new PropertyValueFactory<>("report")
        );

        // Load saved reports
        reportList = databaseAccessor.readObject("SystemReport.bin");

        if (reportList == null) {
            reportList = FXCollections.observableArrayList();
        }

        reportTable.setItems(reportList);


        // Pie Chart
        reportPieChart.getData().clear();

        reportPieChart.getData().add(
                new PieChart.Data("Users", 40)
        );

        reportPieChart.getData().add(
                new PieChart.Data("Job Categories", 25)
        );

        reportPieChart.getData().add(
                new PieChart.Data("Registrations", 20)
        );

        reportPieChart.getData().add(
                new PieChart.Data("Complaints", 10)
        );

        reportPieChart.getData().add(
                new PieChart.Data("Activities", 5)
        );
    }


    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {

        // Validate Report Type
        if (reportTypeCombo.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Report Type",
                    "Please select a report type."
            );

            return;
        }


        // Validate Dates
        if (startDate.getValue() == null ||
                endDate.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Date",
                    "Please select both start date and end date."
            );

            return;
        }


        // Validate Date Range
        if (startDate.getValue().isAfter(endDate.getValue())) {

            AlertGenerator.showWarningAlert(
                    "Invalid Date",
                    "Start date cannot be after end date."
            );

            return;
        }


        // Report generation
        AlertGenerator.showInformationAlert(
                "Report Generated",
                "System report generated successfully."
        );
    }


    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) throws IOException {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/AdminDashboard.fxml"
        );
    }
}