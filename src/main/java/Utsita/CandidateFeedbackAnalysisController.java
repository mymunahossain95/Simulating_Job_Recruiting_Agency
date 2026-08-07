package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.CandidateFeedback;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CandidateFeedbackAnalysisController {

    @javafx.fxml.FXML
    private TableColumn<CandidateFeedback, String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> ratiNgComboBox;
    @javafx.fxml.FXML
    private TableColumn<CandidateFeedback, String> candidateNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CandidateFeedback, String> commenTsTableColumn;
    @javafx.fxml.FXML
    private TableView<CandidateFeedback> feedBackTableView;
    @javafx.fxml.FXML
    private TableColumn<CandidateFeedback, Integer> ratiNgTableColumn;

    private ObservableList<CandidateFeedback> feedbackList;

    @javafx.fxml.FXML
    public void initialize() {
        ratiNgComboBox.getItems().addAll(
                "All",
                "1 Star",
                "2 Stars",
                "3 Stars",
                "4 Stars",
                "5 Stars"
        );
        candidateNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName")
        );

        ratiNgTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("rating")
        );

        commenTsTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("comments")
        );

        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );

        feedbackList = databaseAccessor.readObject("CandidateFeedback.bin");
        feedBackTableView.setItems(feedbackList);
    }

    @javafx.fxml.FXML
    public void onAnalyze(ActionEvent actionEvent) {
        if (ratiNgComboBox.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Rating Required",
                    "Please select a rating."
            );
            return;
        }

        feedbackList = databaseAccessor.readObject("CandidateFeedback.bin");
        feedBackTableView.setItems(feedbackList);

        AlertGenerator.showInformationAlert(
                "Analysis Complete",
                "Analysis completed successfully."
        );
    }

    @javafx.fxml.FXML
    public void onExport(ActionEvent actionEvent) {
        if(feedBackTableView.getItems().isEmpty()){
            AlertGenerator.showWarningAlert(
                    "No Data",
                    "There is no feedback report to export."
            );
            return;
        }
        databaseAccessor.writeObject(
                "CandidateFeedbackReport.bin",
                feedbackList
        );
        AlertGenerator.showInformationAlert(
                "Export Successful",
                "Candidate Feedback report exported successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent, "/ReportsAndAnalyticsManager/ReportAnalyticsDashboard.fxml");
    }
}
