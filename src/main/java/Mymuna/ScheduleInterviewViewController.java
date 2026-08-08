package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import nonuser.Interview;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class ScheduleInterviewViewController {

    @javafx.fxml.FXML
    private Label statusForScheduleInterviewLabel;

    @javafx.fxml.FXML
    private TextField interviewLocationTF;

    @javafx.fxml.FXML
    private TextField interviewTimeTF;

    @javafx.fxml.FXML
    private TextField candidateNameTF;

    @javafx.fxml.FXML
    private TextField candidateIdTF;

    @javafx.fxml.FXML
    private DatePicker interviewDateDP;


    @javafx.fxml.FXML
    public void scheduleInterviewOA(ActionEvent actionEvent) {

        if (candidateIdTF.getText().isEmpty()
                || candidateNameTF.getText().isEmpty()
                || interviewTimeTF.getText().isEmpty()
                || interviewLocationTF.getText().isEmpty()
                || interviewDateDP.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all required fields."
            );

            return;
        }

        String interviewId = "INT" + System.currentTimeMillis();

        Interview interview = new Interview(
                interviewId,
                candidateIdTF.getText(),
                candidateNameTF.getText(),
                "Company",
                interviewDateDP.getValue().toString(),
                interviewTimeTF.getText(),
                interviewLocationTF.getText(),
                "Pending"
        );

        ObservableList<Interview> interviewList =
                databaseAccessor.readObject("Interview.bin");

        if (interviewList == null) {
            interviewList = FXCollections.observableArrayList();
        }

        interviewList.add(interview);

        databaseAccessor.writeObject(
                "Interview.bin",
                interviewList
        );

        statusForScheduleInterviewLabel.setText(
                "Interview Scheduled Successfully"
        );

        AlertGenerator.showInformationAlert(
                "Success",
                "Interview scheduled successfully."
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Employer/EmployerDashboardView.fxml"
        );
    }
}