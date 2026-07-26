package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ScheduleInterviewViewController {
    @javafx.fxml.FXML
    private TableView scheduleInterviewTV;
    @javafx.fxml.FXML
    private Label statusForScheduleInterviewLabel;
    @javafx.fxml.FXML
    private TableColumn interviewLocationTC;
    @javafx.fxml.FXML
    private TableColumn interviewDateTC;
    @javafx.fxml.FXML
    private TableColumn interviewStatusTC;
    @javafx.fxml.FXML
    private TextField interviewLocationTF;
    @javafx.fxml.FXML
    private ComboBox interviewTimeCB;
    @javafx.fxml.FXML
    private TableColumn interviewTimeTC;
    @javafx.fxml.FXML
    private ComboBox candidateNameCB;
    @javafx.fxml.FXML
    private TableColumn candidateNameTC;

    @javafx.fxml.FXML
    public void scheduleInterviewOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOA(ActionEvent actionEvent) {
    }
}
