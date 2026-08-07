package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.PlacementStatistics;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class PlacementStatisticsController {
    @javafx.fxml.FXML
    private TableColumn<PlacementStatistics, String> indusTryTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> yeArComboBox;
    @javafx.fxml.FXML
    private TableColumn<PlacementStatistics, String> comPanyTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PlacementStatistics, String> candidateNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PlacementStatistics, String> staTusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> montHComboBox;
    @javafx.fxml.FXML
    private TableView<PlacementStatistics> placementStateTableView;

    private ObservableList<PlacementStatistics> placementList;

    @javafx.fxml.FXML
    public void initialize() {
        montHComboBox.getItems().addAll(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        );

        yeArComboBox.getItems().addAll(
                "2024",
                "2025",
                "2026",
                "2027"
        );

        candidateNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("CandidateName")
        );
        comPanyTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("Company")
        );
        indusTryTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("Industry")
        );
        staTusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("Status")
        );

        placementList = databaseAccessor.readObject("PlacementStatistics.bin");

        placementStateTableView.setItems(placementList);
    }

    @javafx.fxml.FXML
    public void exportButton(ActionEvent actionEvent) {
        databaseAccessor.writeObject(
                "PlacementStatistics.bin",
                placementList
        );

        AlertGenerator.showInformationAlert(
                "Export Successful",
                "Placement statistics exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
        if (montHComboBox.getValue() == null ||
                yeArComboBox.getValue() == null){

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please select Month and Year."
            );
            return;
        }

        placementStateTableView.setItems(placementList);

        AlertGenerator.showInformationAlert(
                "Report Generated",
                "Placement report generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent, "/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml");
    }
}
