package Ridwan;

import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.InterviewReport;
import nonuser.InterviewSchedule;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U6_G7_GenerateInterviewReportController {

    @javafx.fxml.FXML
    private DatePicker fromDatePicker;

    @javafx.fxml.FXML
    private DatePicker toDatePicker;

    @javafx.fxml.FXML
    private TableView<InterviewReport> reportTable;

    @javafx.fxml.FXML
    private TableColumn<InterviewReport, String> candidateColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewReport, String> resultColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewReport, String> statusColumn;

    @javafx.fxml.FXML
    private TableColumn<InterviewReport, String> interviewDateColumn;

    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<InterviewReport> allReportsList;

    @javafx.fxml.FXML
    public void initialize() {

        // Bind TableView columns to getter methods in InterviewReport model
        candidateColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        resultColumn.setCellValueFactory(new PropertyValueFactory<>("result"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        interviewDateColumn.setCellValueFactory(new PropertyValueFactory<>("interviewDate"));

        // Read saved report records from binary file
        allReportsList = databaseAccessor.readObject("InterviewReports.bin");

        // If no report records exist, auto-generate initial sample reports from InterviewSchedules
        if (allReportsList.isEmpty()) {
            ObservableList<InterviewSchedule> schedules = databaseAccessor.readObject("InterviewSchedules.bin");
            for (InterviewSchedule schedule : schedules) {
                allReportsList.add(new InterviewReport(
                        schedule.getCandidateName(),
                        schedule.getDate() != null ? schedule.getDate() : LocalDate.now().toString(),
                        "Pending Evaluation",
                        schedule.getStatus() != null ? schedule.getStatus() : "Completed"
                ));
            }
            databaseAccessor.writeObject("InterviewReports.bin", allReportsList);
        }

        // Initially show all reports in table view
        reportTable.setItems(allReportsList);
    }

    @javafx.fxml.FXML
    public void generateBtnOnAction(ActionEvent actionEvent) {

        LocalDate fromDate = fromDatePicker.getValue();
        LocalDate toDate = toDatePicker.getValue();

        // Validation for date pickers
        if (fromDate == null || toDate == null) {
            AlertGenerator.showWarningAlert("Validation Error", "Please select both From Date and To Date.");
            statusLabel.setText("Status: Please select a valid date range.");
            return;
        }

        if (fromDate.isAfter(toDate)) {
            AlertGenerator.showWarningAlert("Validation Error", "From Date cannot be after To Date.");
            statusLabel.setText("Status: Invalid date range sequence.");
            return;
        }

        // Filter reports within selected date range
        ObservableList<InterviewReport> filteredList = FXCollections.observableArrayList();

        for (InterviewReport report : allReportsList) {
            try {
                LocalDate repDate = LocalDate.parse(report.getInterviewDate());
                if ((repDate.isEqual(fromDate) || repDate.isAfter(fromDate)) &&
                        (repDate.isEqual(toDate) || repDate.isBefore(toDate))) {
                    filteredList.add(report);
                }
            } catch (Exception e) {
                // If date parsing fails, include record by default or skip
                filteredList.add(report);
            }
        }

        reportTable.setItems(filteredList);
        statusLabel.setText("Status: Generated report with " + filteredList.size() + " record(s) from " + fromDate + " to " + toDate);

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Found " + filteredList.size() + " interview report(s) between " + fromDate + " and " + toDate + "."
        );
    }

    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/InterviewCoordinatorDashboardView.fxml"
        );
    }
}
