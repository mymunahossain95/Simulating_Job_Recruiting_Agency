package Nazila;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.CounselingSession;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

import java.time.LocalDate;
import java.time.LocalTime;

public class CareerCounselorCounselingSessionController {
    @javafx.fxml.FXML
    private Label careercounselPreviousGuidanceLabel;
    @javafx.fxml.FXML
    private TableView<CounselingSession> candidateInformationTableView;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession, LocalDate> sessionDateCol3;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession,String> sessionStatusCol5;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession,String> candidateNameCol2;
    @javafx.fxml.FXML
    private DatePicker sessionDatedatepicker;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession,String> sessionIDCol1;
    @javafx.fxml.FXML
    private TableColumn<CounselingSession, LocalTime> sessionTimeCol4;

    private ObservableList<CounselingSession> sessionList;

    @javafx.fxml.FXML
    public void initialize(){
        sessionIDCol1.setCellValueFactory(new PropertyValueFactory<>("sessionID"));
        candidateNameCol2.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        sessionDateCol3.setCellValueFactory(new PropertyValueFactory<>("sessionDate"));
        sessionTimeCol4.setCellValueFactory(new PropertyValueFactory<>("sessionTime"));
        sessionStatusCol5.setCellValueFactory(new PropertyValueFactory<>("status"));

        candidateInformationTableView.setItems(sessionList);
    }

    @javafx.fxml.FXML
    public void handleSaveSessionOA(ActionEvent actionEvent) {
        if (sessionDatedatepicker.getValue().isAfter(LocalDate.now())) {

            AlertGenerator.showWarningAlert(
                    "Invalid Date",
                    "Session date cannot be a future date"
            );

            return;
        }

        databaseAccessor.writeObject(
                "CounselingSession.bin",
                sessionList
        );

        AlertGenerator.showInformationAlert(
                "Saved",
                "Counseling session saved successfully"
        );

    }

    @javafx.fxml.FXML
    public void handleViewSessionOA(ActionEvent actionEvent) {
        if (sessionDatedatepicker.getValue().isAfter(LocalDate.now())) {

            AlertGenerator.showWarningAlert(
                    "Invalid Date",
                    "Session date cannot be a future date"
            );

            return;
        }

        careercounselPreviousGuidanceLabel.setText(
                "Previous Guidance\n\n"
                        + "Session Date: "
                        + sessionDatedatepicker.getValue()
        );

        AlertGenerator.showInformationAlert(
                "Session Loaded",
                "Counseling session information loaded successfully"
        );

    }

    @javafx.fxml.FXML
    public void handleEndSessionOA(ActionEvent actionEvent) {

        if (sessionDatedatepicker.getValue().isAfter(LocalDate.now())) {

            AlertGenerator.showWarningAlert(
                    "Invalid Date",
                    "Session date cannot be a future date"
            );

            return;
        }

        careercounselPreviousGuidanceLabel.setText(
                "Previous Guidance\n\n"
                        + "Session Date: "
                        + sessionDatedatepicker.getValue()
        );

        AlertGenerator.showInformationAlert(
                "Session Loaded",
                "Counseling session information loaded successfully"
        );
    }

    @javafx.fxml.FXML
    public void handleCounselingSessionHomeButtonOA(ActionEvent actionEvent) {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Nazila/CareerCounselorDashboard.fxml"
        );
    }
}
