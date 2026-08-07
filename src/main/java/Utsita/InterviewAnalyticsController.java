package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.InterviewAnalytics;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class InterviewAnalyticsController {

    @javafx.fxml.FXML
    private TableView<InterviewAnalytics> IntervieWTableView;
    @javafx.fxml.FXML
    private TableColumn<InterviewAnalytics, Double> scoReTableColumn;
    @javafx.fxml.FXML
    private DatePicker analysisDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> industRyComboBox;
    @javafx.fxml.FXML
    private TableColumn<InterviewAnalytics, String> candidateNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<InterviewAnalytics, String> successRateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<InterviewAnalytics, String> resuLtTableColumn;

    private ObservableList<InterviewAnalytics> interviewList;

    @javafx.fxml.FXML
    public void initialize(){
        industRyComboBox.getItems().addAll(
                "Software",
                "Banking",
                "Healthcare",
                "Education",
                "Marketing"
        );

        candidateNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName")
        );
        scoReTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("score")
        );

        resuLtTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("result")
        );

        successRateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("successRate")
        );

        interviewList = databaseAccessor.readObject("InterviewAnalytics.bin");

        IntervieWTableView.setItems(interviewList);
    }

    @javafx.fxml.FXML
    public void saveAnalyzeButton(ActionEvent actionEvent) {
        databaseAccessor.writeObject("InterviewAnalytics.bin", interviewList);

        AlertGenerator.showInformationAlert(
                "Saved",
                "Saved Successfully"
        );
    }

    @javafx.fxml.FXML
    public void analyzeButton(ActionEvent actionEvent) {
        if(industRyComboBox.getValue()== null){
            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Select an Industry first"
            );
            return;
        }
        if(analysisDatePicker.getValue()== null) {
            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Select Analysis Date"
            );
            return;
        }

        IntervieWTableView.setItems(interviewList);
        AlertGenerator.showInformationAlert(
                "Analysis Complete",
                "Generated Successfully"

        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent, "/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml"
        );
    }
}
