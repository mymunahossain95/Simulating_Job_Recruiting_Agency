package mymuna;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ShortlistCandidateViewController {
    @javafx.fxml.FXML
    private TableView shortlistCandidateTV;
    @javafx.fxml.FXML
    private Label statusForShortlistCandidateLabel;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn candidateIdTC;
    @javafx.fxml.FXML
    private TableColumn candidateNameTC;
    @javafx.fxml.FXML
    private TableColumn appliedPositionTC;

    @javafx.fxml.FXML
    public void shortlistCandidateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectCandidateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOA(ActionEvent actionEvent) {
    }
}
