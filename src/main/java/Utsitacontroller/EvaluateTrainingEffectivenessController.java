package Utsitacontroller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EvaluateTrainingEffectivenessController {
    @javafx.fxml.FXML
    private TableColumn completionRateTableColumn;
    @javafx.fxml.FXML
    private TableColumn programTableColumn;
    @javafx.fxml.FXML
    private TableColumn participantsTableColumn;
    @javafx.fxml.FXML
    private ComboBox trainigProgramComboBox;
    @javafx.fxml.FXML
    private DatePicker evaluationDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn averageScoreTableColumn;
    @javafx.fxml.FXML
    private TableView trainingEvaluationTableView;

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateEvaluationButton(ActionEvent actionEvent) {
    }
}
