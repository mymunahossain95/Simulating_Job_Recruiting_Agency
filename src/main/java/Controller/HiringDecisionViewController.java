package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class HiringDecisionViewController {
    @javafx.fxml.FXML
    private ComboBox decisionCB;
    @javafx.fxml.FXML
    private TableColumn decisionTC;
    @javafx.fxml.FXML
    private Label statusForHiringDecisionLabel;
    @javafx.fxml.FXML
    private TableColumn decisionDateTC;
    @javafx.fxml.FXML
    private TextField remarkTF;
    @javafx.fxml.FXML
    private TableView hiringDecisionTV;
    @javafx.fxml.FXML
    private TableColumn positionTC;
    @javafx.fxml.FXML
    private TableColumn candidateIdTC;
    @javafx.fxml.FXML
    private ComboBox candidateNameCB;
    @javafx.fxml.FXML
    private TableColumn candidateNameTC;

    @javafx.fxml.FXML
    public void saveDecisionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOA(ActionEvent actionEvent) {
    }
}
