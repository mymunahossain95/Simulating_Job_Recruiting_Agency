package Mymuna;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Interview;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class AttendInterviewViewController {

    @javafx.fxml.FXML
    private TableView<Interview> attendinterviewViewTV;

    @javafx.fxml.FXML
    private TableColumn<Interview, String> interviewIdTC;

    @javafx.fxml.FXML
    private TableColumn<Interview, String> interviewDateTC;

    @javafx.fxml.FXML
    private TableColumn<Interview, String> attendanceStatusTC;

    @javafx.fxml.FXML
    private TableColumn<Interview, String> interviewTimeTC;

    @javafx.fxml.FXML
    private TableColumn<Interview, String> companyNameTC;

    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Label statusForScheduledInterviewLabel;

    private ObservableList<Interview> interviewList;


    @javafx.fxml.FXML
    public void initialize() {

        interviewIdTC.setCellValueFactory(new PropertyValueFactory<>("interviewId"));
        companyNameTC.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        interviewDateTC.setCellValueFactory(new PropertyValueFactory<>("interviewDate"));
        interviewTimeTC.setCellValueFactory(new PropertyValueFactory<>("interviewTime"));

        attendanceStatusTC.setCellValueFactory(
                new PropertyValueFactory<>("attendanceStatus")
        );

        interviewList =
                databaseAccessor.readObject("Interview.bin");

        attendinterviewViewTV.setItems(interviewList);
    }


    @javafx.fxml.FXML
    public void confirmAttendanceOA(ActionEvent actionEvent) {

        interviewList =
                databaseAccessor.readObject("Interview.bin");

        attendinterviewViewTV.setItems(interviewList);

        statusForScheduledInterviewLabel.setText(
                "Attendance Confirmed"
        );

        AlertGenerator.showInformationAlert(
                "Attendance Confirmed",
                "Interview attendance confirmed successfully."
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}