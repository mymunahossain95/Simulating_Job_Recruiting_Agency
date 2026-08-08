package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private TableView<RecruitmentReport> recrutmentReportsTV;

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
    public void initialize() {

        reportTypeCB.getItems().addAll(
                "Interview Report",
                "Application Report",
                "Hiring Report"
        );

        reportIdTC.setCellValueFactory(
                new PropertyValueFactory<>("reportId")
        );

        reportTypeTC.setCellValueFactory(
                new PropertyValueFactory<>("reportType")
        );

        totalRecordsTC.setCellValueFactory(
                new PropertyValueFactory<>("totalRecords")
        );

        generatedDateTC.setCellValueFactory(
                new PropertyValueFactory<>("generatedDate")
        );

        reportList =
                databaseAccessor.readObject("RecruitmentReport.bin");

        if (reportList == null) {
            reportList = FXCollections.observableArrayList();
        }

        recrutmentReportsTV.setItems(reportList);
    }


    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {

        if (reportTypeCB.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please select a report type."
            );

            return;
        }

        recrutmentReportsTV.setItems(reportList);

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Recruitment report generated successfully."
        );
    }


    @javafx.fxml.FXML
    public void BackToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Employer/EmployerDashboardView.fxml"
        );
    }
}