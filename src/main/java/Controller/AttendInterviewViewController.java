package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AttendInterviewViewController {
    @javafx.fxml.FXML
    private TableView attendinterviewViewTV;
    @javafx.fxml.FXML
    private TableColumn interviewIdTC;
    @javafx.fxml.FXML
    private TableColumn interviewDateTC;
    @javafx.fxml.FXML
    private TableColumn attendanceStatusTC;
    @javafx.fxml.FXML
    private TableColumn interviewTimeTC;
    @javafx.fxml.FXML
    private TableColumn companyNameTC;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void requestRescheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmAttendanceOA(ActionEvent actionEvent) {
    }
}
