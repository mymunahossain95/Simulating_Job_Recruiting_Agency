package Utsita;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Candidate;
import nonuser.ManageTrainingAttendance;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class ManageTrainingAttendanceController {

    @javafx.fxml.FXML
    private TableView<ManageTrainingAttendance> attendanceTableView;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainingAttendance, String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> sessionComboBox;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainingAttendance, String> attendanceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainingAttendance, String> candidateNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageTrainingAttendance, String> candidateIdTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramComboBox;

    @javafx.fxml.FXML
    public void initialize(){
        trainingProgramComboBox.getItems().addAll(
                "Java Programming",
                "Python",
                "Web Development",
                "Data Analytics"
        );
        sessionComboBox.getItems().addAll(
                "Session 1",
                "Session 2",
                "Session 3"
        );

        candidateIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateId"));
        candidateNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("candidateName"));
        attendanceTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("attendance"));
        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        attendanceTableView.setItems(
                databaseAccessor.readObject("TrainingAttendance.bin")
        );
    }

    @javafx.fxml.FXML
    public void markPresentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadAttendanceButton(ActionEvent actionEvent) {
        if (trainingProgramComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Training Program",
                    "Select a training program."
            );
            return;
        }
        if (sessionComboBox.getValue() == null) {
            AlertGenerator.showWarningAlert(
                    "Session",
                    "Select a session."
            );
            return;
        }
        ObservableList<Candidate> candidateList =
                databaseAccessor.readObject("Candidate.bin");

        attendanceTableView.getItems().clear();

        for (Candidate c : candidateList) {
            attendanceTableView.getItems().add(
                    new ManageTrainingAttendance(
                            String.valueOf(c.getCandidateId()),
                            c.getCandidateName(),
                            "Absent",
                            "Pending"
                    )
            );
        }
        AlertGenerator.showInformationAlert(
                "Loaded",
                "Attendance loaded successfully."
        );
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        if (attendanceTableView.getItems().isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "No Data",
                    "No attendance data to save."
            );
            return;
        }

        databaseAccessor.writeObject(
                "TrainingAttendance.bin",
                attendanceTableView.getItems()
        );
        AlertGenerator.showInformationAlert(
                "Saved",
                "Attendance saved successfully."
        );
    }

    @javafx.fxml.FXML
    public void homeButton(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(actionEvent,
                "/TrainingCoordinator/TrainingCoordinatorDashBoard");
    }
}
