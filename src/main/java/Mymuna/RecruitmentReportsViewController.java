package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.RecruitmentReport;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class RecruitmentReportsViewController {

    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCB;

    @javafx.fxml.FXML
    private TableColumn<RecruitmentReport, String> totalRecordsTC;

    @javafx.fxml.FXML
    private TableColumn<RecruitmentReport, String> reportIdTC;

    @javafx.fxml.FXML
    private TableColumn<RecruitmentReport, String> generatedDateTC;

    @javafx.fxml.FXML
    private TableColumn<RecruitmentReport, String> reportTypeTC;

    private ObservableList<RecruitmentReport> reportList;

    @javafx.fxml.FXML
    private PieChart genderPieChart;

    @javafx.fxml.FXML
    private TableView<RecruitmentReport> recruitmentReportsTV;


    @javafx.fxml.FXML
    public void initialize() {


        genderPieChart.getData().clear();

        genderPieChart.setTitle("Candidate Gender Distribution");
        genderPieChart.getData().add(new PieChart.Data("Male", 60));
        genderPieChart.getData().add(new PieChart.Data("Female", 40));



        reportTypeCB.getItems().addAll(
                "Interview Report",
                "Application Report",
                "Hiring Report"
        );



        reportIdTC.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        reportTypeTC.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        totalRecordsTC.setCellValueFactory(new PropertyValueFactory<>("totalRecords"));
        generatedDateTC.setCellValueFactory(new PropertyValueFactory<>("generatedDate"));


        reportList = databaseAccessor.readObject("RecruitmentReport.bin");

        if (reportList == null) {
            reportList = FXCollections.observableArrayList();
        }

        recruitmentReportsTV.setItems(reportList);
    }


    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {

        if (reportTypeCB.getValue() == null) {

            AlertGenerator.showWarningAlert("Missing Information", "Please select a report type.");
            return;
        }
        recruitmentReportsTV.setItems(reportList);

        AlertGenerator.showInformationAlert("Report Generated", "Recruitment report generated successfully.");
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Employer/EmployerDashboardView.fxml");
    }
}