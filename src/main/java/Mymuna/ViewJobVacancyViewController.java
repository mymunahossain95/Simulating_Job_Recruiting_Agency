package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Job;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class ViewJobVacancyViewController {

    @javafx.fxml.FXML
    private TableColumn<Job, String> jobIdTC;

    @javafx.fxml.FXML
    private TableColumn<Job, String> jobStatusTC;

    @javafx.fxml.FXML
    private TableColumn<Job, String> jobTitleTC;

    @javafx.fxml.FXML
    private TableColumn<Job, String> applicationDeadlineTC;

    @javafx.fxml.FXML
    private TableColumn<Job, String> jobCategoryTC;

    @javafx.fxml.FXML
    private TableView<Job> viewJobVacancyTV;

    @javafx.fxml.FXML
    private TableColumn<Job, String> salaryTC;


    @javafx.fxml.FXML
    public void initialize() {

        jobIdTC.setCellValueFactory(
                new PropertyValueFactory<>("jobId")
        );

        jobTitleTC.setCellValueFactory(
                new PropertyValueFactory<>("jobTitle")
        );

        applicationDeadlineTC.setCellValueFactory(
                new PropertyValueFactory<>("applicationDeadline")
        );

        jobStatusTC.setCellValueFactory(
                new PropertyValueFactory<>("jobStatus")
        );

        jobCategoryTC.setCellValueFactory(
                new PropertyValueFactory<>("jobCategory")
        );

        salaryTC.setCellValueFactory(
                new PropertyValueFactory<>("salary")
        );

        loadJobs();
    }


    @javafx.fxml.FXML
    public void refreshOA(ActionEvent actionEvent) {

        loadJobs();
    }


    private void loadJobs() {

        ObservableList<Job> jobList =
                databaseAccessor.readObject("Job.bin");

        if (jobList == null) {
            jobList = FXCollections.observableArrayList();
        }

        viewJobVacancyTV.setItems(jobList);
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Employer/EmployerDashboardView.fxml"
        );
    }
}