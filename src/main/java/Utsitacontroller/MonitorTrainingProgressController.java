package Utsitacontroller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MonitorTrainingProgressController {
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox sessionComboBox;
    @javafx.fxml.FXML
    private ComboBox trainingProgram;
    @javafx.fxml.FXML
    private TableColumn attendanceTableColumn;
    @javafx.fxml.FXML
    private TableColumn completedModulesTableColumn;
    @javafx.fxml.FXML
    private TableView trainingProgressTableView;
    @javafx.fxml.FXML
    private TableColumn progressTableColumn;
    @javafx.fxml.FXML
    private Label completedParticipantsLabel;
    @javafx.fxml.FXML
    private Label activeParticipantsLabel;
    @javafx.fxml.FXML
    private Label completationRateLabel;
    @javafx.fxml.FXML
    private TableColumn candidateTableColumn;

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadProgressButton(ActionEvent actionEvent) {
    }
}
