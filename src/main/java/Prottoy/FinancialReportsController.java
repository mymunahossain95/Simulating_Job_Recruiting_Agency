package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.FinancialReport;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

import java.io.IOException;
import java.time.LocalDate;

public class FinancialReportsController {

    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;

    @javafx.fxml.FXML
    private DatePicker fromDatePicker;

    @javafx.fxml.FXML
    private DatePicker toDatePicker;

    @javafx.fxml.FXML
    private TableView<FinancialReport> reportTable;

    @javafx.fxml.FXML
    private TableColumn<FinancialReport, String> reportIdColumn;

    @javafx.fxml.FXML
    private TableColumn<FinancialReport, String> reportNameColumn;

    @javafx.fxml.FXML
    private TableColumn<FinancialReport, String> generatedDateColumn;

    @javafx.fxml.FXML
    private TableColumn<FinancialReport, Double> totalAmountColumn;

    private ObservableList<FinancialReport> reportList;

    @javafx.fxml.FXML
    public void initialize() {

        reportTypeComboBox.getItems().addAll(
                "Payment Report",
                "Refund Report",
                "Transaction Report",
                "Financial Summary"
        );

        reportIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportId"));

        reportNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("reportName"));

        generatedDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("generatedDate"));

        totalAmountColumn.setCellValueFactory(
                new PropertyValueFactory<>("totalAmount"));

        reportList =
                databaseAccessor.readObject("FinancialReport.bin");

        if (reportList == null) {
            reportList = FXCollections.observableArrayList();
        }

        reportTable.setItems(reportList);
    }

    @javafx.fxml.FXML
    public void onGenerateReport(ActionEvent actionEvent) {

        if (reportTypeComboBox.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Report Type",
                    "Please select a report type."
            );

            return;
        }

        LocalDate fromDate = fromDatePicker.getValue();
        LocalDate toDate = toDatePicker.getValue();

        if (fromDate == null || toDate == null) {

            AlertGenerator.showWarningAlert(
                    "Date Range",
                    "Please select both From and To dates."
            );

            return;
        }

        if (fromDate.isAfter(toDate)) {

            AlertGenerator.showWarningAlert(
                    "Invalid Date",
                    "From date cannot be after To date."
            );

            return;
        }

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Financial report generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void onDownloadReport(ActionEvent actionEvent) {

        if (reportTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Download Report",
                    "Please select a report first."
            );

            return;
        }

        AlertGenerator.showInformationAlert(
                "Download Report",
                "Report is available for download."
        );
    }

    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

      //  SceneSwitchingHelper.switchScene(
        //        actionEvent,
          //      "/FinanceOfficer/FinanceOfficerDashboard.fxml"
        //);
    //}
}