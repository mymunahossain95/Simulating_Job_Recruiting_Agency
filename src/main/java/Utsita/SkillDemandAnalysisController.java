package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.SkillDemand;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class SkillDemandAnalysisController {

    @javafx.fxml.FXML
    private TableColumn<SkillDemand, String> indusTryTableColumn;
    @javafx.fxml.FXML
    private TableView<SkillDemand> skillDemandTableView;
    @javafx.fxml.FXML
    private ComboBox<String> industrYComboBox;
    @javafx.fxml.FXML
    private TableColumn<SkillDemand, Double> demandPercentageTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SkillDemand, String> skillNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SkillDemand, Double> growthRateTableColumn;

    private ObservableList<SkillDemand> skillDemandList;

    @javafx.fxml.FXML
    public void initialize(){
        industrYComboBox.getItems().addAll(
                "Software",
                "Banking",
                "Healthcare",
                "Education",
                "Telecommunication",
                "Manufacturing"
        );
        skillNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("skillName")
        );
        indusTryTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("industry")
        );
        demandPercentageTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("demandPercentage")
        );
        growthRateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("growthRate")
        );

        skillDemandList = databaseAccessor.readObject("SkillDemandAnalysis.bin");
        skillDemandTableView.setItems(skillDemandList);
    }

    @javafx.fxml.FXML
    public void onAnalyze(ActionEvent actionEvent) {
        if (industrYComboBox.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Industry Required",
                    "Select an industry."
            );
            return;
        }

        skillDemandList = databaseAccessor.readObject("SkillDemandAnalysis.bin");
        skillDemandTableView.setItems(skillDemandList);

        AlertGenerator.showInformationAlert(
                "Analysis Complete",
                "Skill demand analysis generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void onExport(ActionEvent actionEvent) {
        if (skillDemandTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "No Data",
                    "There is no report to export."
            );
            return;
        }
        databaseAccessor.writeObject(
                "SkillDemandReport.bin",
                skillDemandList
        );

        AlertGenerator.showInformationAlert(
                "Exported",
                "Report exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml");
    }
}
