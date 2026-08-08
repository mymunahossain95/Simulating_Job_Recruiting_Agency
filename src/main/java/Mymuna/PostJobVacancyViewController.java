package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import nonuser.Job;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class PostJobVacancyViewController {

    @javafx.fxml.FXML
    private TextField jobDescriptionTF;

    @javafx.fxml.FXML
    private TextField salaryTF;

    @javafx.fxml.FXML
    private DatePicker applicationDeadlineDP;

    @javafx.fxml.FXML
    private TextField jobTitleTF;

    @javafx.fxml.FXML
    private ComboBox jobCategoryCB;

    @javafx.fxml.FXML
    private TextField jobIdTF;

    @javafx.fxml.FXML
    private Label statusForPostJobVacancyLabel;


    private ObservableList<Job> jobList;


    @javafx.fxml.FXML
    public void initialize() {

        jobCategoryCB.getItems().addAll(
                "IT",
                "Finance",
                "Marketing",
                "HR",
                "Engineering"
        );

        jobList =
                databaseAccessor.readObject("Job.bin");

        if (jobList == null) {
            jobList = FXCollections.observableArrayList();
        }
    }


    @javafx.fxml.FXML
    public void publishJobOA(ActionEvent actionEvent) {

        if (jobIdTF.getText().isEmpty()
                || jobTitleTF.getText().isEmpty()
                || salaryTF.getText().isEmpty()
                || jobDescriptionTF.getText().isEmpty()
                || jobCategoryCB.getValue() == null
                || applicationDeadlineDP.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all required fields."
            );

            return;
        }


        Job job = new Job(
                jobIdTF.getText(),
                jobTitleTF.getText(),
                "Company",
                jobCategoryCB.getValue().toString(),
                "Not Specified",
                salaryTF.getText(),
                applicationDeadlineDP.getValue().toString(),
                jobDescriptionTF.getText(),
                "Open"
        );


        jobList.add(job);


        databaseAccessor.writeObject(
                "Job.bin",
                jobList
        );


        statusForPostJobVacancyLabel.setText(
                "Job Published Successfully"
        );


        AlertGenerator.showInformationAlert(
                "Job Published",
                "Job vacancy published successfully."
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