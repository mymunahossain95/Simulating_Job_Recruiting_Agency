package Utsita;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.EvaluateTrainingEffectiveness;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

public class EvaluateTrainingEffectivenessController {

    @javafx.fxml.FXML
    private ComboBox<String> trainigProgramComboBox;
    @javafx.fxml.FXML
    private DatePicker evaluationDateDatePicker;
    @javafx.fxml.FXML
    private TableView<EvaluateTrainingEffectiveness> trainingEvaluationTableView;
    @javafx.fxml.FXML
    private TableColumn<EvaluateTrainingEffectiveness,String> programTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EvaluateTrainingEffectiveness,Integer> participantsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EvaluateTrainingEffectiveness,String> averageScoreTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EvaluateTrainingEffectiveness,String> completionRateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {

        trainigProgramComboBox.getItems().addAll(
                "Java Programming",
                "Python",
                "Web Development",
                "Data Analytics"
        );

        programTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("program"));

        participantsTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("participants"));

        averageScoreTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("averageScore"));

        completionRateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("completionRate"));
    }

    @javafx.fxml.FXML
    public void generateEvaluationButton(ActionEvent event) {

        if (trainigProgramComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Training Program",
                    "Please select a training program."
            );
            return;
        }

        if (evaluationDateDatePicker.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Evaluation Date",
                    "Please select an evaluation date."
            );
            return;
        }

        trainingEvaluationTableView.getItems().clear();

        trainingEvaluationTableView.getItems().add(
                new EvaluateTrainingEffectiveness(
                        trainigProgramComboBox.getValue(),
                        30,
                        "86%",
                        "90%"
                )
        );

        AlertGenerator.showInformationAlert(
                "Generated",
                "Training evaluation generated successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent event) {

        SceneSwitchingHelper.switchScene(
                event,
                "/TrainingCoordinator/TrainingCoordinatorDashboard.fxml"
        );
    }
}
