package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class FinancialComplianceController {

    @javafx.fxml.FXML
    private TableView<ComplianceRecord> complianceTable;

    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> complianceIdColumn;

    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> ruleColumn;

    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> descriptionColumn;

    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> statusColumn;

    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> reviewDateColumn;


    private ObservableList<ComplianceRecord> complianceList;


    @javafx.fxml.FXML
    public void initialize() {

        complianceIdColumn.setCellValueFactory(
                new PropertyValueFactory<>("complianceId"));

        ruleColumn.setCellValueFactory(
                new PropertyValueFactory<>("ruleName"));

        descriptionColumn.setCellValueFactory(
                new PropertyValueFactory<>("description"));

        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        reviewDateColumn.setCellValueFactory(
                new PropertyValueFactory<>("reviewDate"));

        complianceList = FXCollections.observableArrayList();

        complianceTable.setItems(complianceList);
    }


    @FXML
    public void onRefresh(ActionEvent actionEvent) {

        complianceTable.refresh();

        AlertGenerator.showInformationAlert(
                "Refresh",
                "Financial compliance information refreshed successfully."
        );
    }


    @FXML
    public void onGenerateComplianceReport(ActionEvent actionEvent) {

        if (complianceTable.getItems().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Compliance Report",
                    "No compliance information is available."
            );

            return;
        }

        AlertGenerator.showInformationAlert(
                "Compliance Report",
                "Financial compliance report generated successfully."
        );
    }


    //@FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

      //  SceneSwitchingHelper.switchScene(
        //        actionEvent,
          //      "/FinanceOfficer/FinanceOfficerDashboard.fxml"
        //);
    //}


    public static class ComplianceRecord {

        private String complianceId;
        private String ruleName;
        private String description;
        private String status;
        private String reviewDate;

        public ComplianceRecord(
                String complianceId,
                String ruleName,
                String description,
                String status,
                String reviewDate) {

            this.complianceId = complianceId;
            this.ruleName = ruleName;
            this.description = description;
            this.status = status;
            this.reviewDate = reviewDate;
        }

        public String getComplianceId() {
            return complianceId;
        }

        public String getRuleName() {
            return ruleName;
        }

        public String getDescription() {
            return description;
        }

        public String getStatus() {
            return status;
        }

        public String getReviewDate() {
            return reviewDate;
        }
    }
}