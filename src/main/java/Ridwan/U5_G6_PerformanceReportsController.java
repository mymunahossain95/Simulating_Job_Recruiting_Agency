package Ridwan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.PerformanceReport;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class U5_G6_PerformanceReportsController {

    // FXML fields linked to your UI elements
    @javafx.fxml.FXML
    private Label titleLabel;

    @javafx.fxml.FXML
    private ComboBox<String> candidateComboBox;

    @javafx.fxml.FXML
    private TableView<PerformanceReport> performanceTable;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, String> assessmentColumn;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, Double> scoreColumn;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, Integer> attemptsColumn;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, Double> averageColumn;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, String> performanceColumn;

    @javafx.fxml.FXML
    private PieChart reportPerfomancePieChart;

    // ObservableLists for binary data and filtered display
    private ObservableList<PerformanceReport> allReportsList;
    private ObservableList<PerformanceReport> displayList;

    @javafx.fxml.FXML
    public void initialize() {
        // 1. Initialize PieChart
        reportPerfomancePieChart.getData().clear();
        reportPerfomancePieChart.setTitle("Performance Overview");
        reportPerfomancePieChart.getData().addAll(
                new PieChart.Data("Passed (75%)", 75),
                new PieChart.Data("Failed (25%)", 25)
        );

        // 2. Populate candidate selection options
        candidateComboBox.getItems().addAll(
                "John Doe",
                "Jane Smith",
                "Alex Johnson",
                "Rahim Ahmed"
        );

        // 3. Bind TableView columns to getter methods in PerformanceReport model class
        assessmentColumn.setCellValueFactory(new PropertyValueFactory<>("assessmentName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        attemptsColumn.setCellValueFactory(new PropertyValueFactory<>("attempts"));
        averageColumn.setCellValueFactory(new PropertyValueFactory<>("averageScore"));
        performanceColumn.setCellValueFactory(new PropertyValueFactory<>("performanceLevel"));

        // 4. Read performance report records from binary file
        allReportsList = databaseAccessor.readObject("PerformanceReports.bin");

        // 5. Set up list for displayed data
        displayList = FXCollections.observableArrayList();
        performanceTable.setItems(displayList);
    }

    // Event handler for Generate Report button
    @javafx.fxml.FXML
    public void generateReportBtnOnAction(ActionEvent actionEvent) {

        String selectedCandidate = candidateComboBox.getValue();

        // Validation for candidate selection
        if (selectedCandidate == null) {
            AlertGenerator.showWarningAlert(
                    "Validation Error",
                    "Please select a candidate to generate performance report."
            );
            return;
        }

        // Clear existing items in table
        displayList.clear();

        // If file has saved data, load for selected candidate; otherwise create sample data
        if (!allReportsList.isEmpty()) {
            displayList.addAll(allReportsList);
        } else {
            // Sample report records
            PerformanceReport report1 = new PerformanceReport(
                    "Java Fundamentals Test",
                    88.5,
                    1,
                    82.0,
                    "Excellent"
            );
            PerformanceReport report2 = new PerformanceReport(
                    "Database Queries Test",
                    76.0,
                    2,
                    70.5,
                    "Good"
            );

            displayList.add(report1);
            displayList.add(report2);

            // Persist generated sample data to binary file
            databaseAccessor.writeObject("PerformanceReports.bin", displayList);
        }

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Performance report generated successfully for " + selectedCandidate
        );
    }

    // Back to Dashboard button event handler
    @javafx.fxml.FXML
    public void backtodashbtnOnAction(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/com.example.simulating_job_recruiting_agency/SkillAssessmentOfficer/SkillAssessmentOfficerDashboardView.fxml"
        );
    }
}