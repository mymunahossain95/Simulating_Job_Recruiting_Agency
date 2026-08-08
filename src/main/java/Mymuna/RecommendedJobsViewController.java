package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Job;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class RecommendedJobsViewController {

    @javafx.fxml.FXML
    private TableColumn<Job, String> jobIdTC;

    @javafx.fxml.FXML
    private TableView<Job> recommendedJobsTV;

    @javafx.fxml.FXML
    private TableColumn<Job, String> companyNameTC;

    @javafx.fxml.FXML
    private TableColumn<Job, String> jobTitleTC;

    @javafx.fxml.FXML
    private TableColumn<Job, String> applicationDeadlineTC;


    private ObservableList<Job> jobList;


    @javafx.fxml.FXML
    public void initialize() {

        jobIdTC.setCellValueFactory(
                new PropertyValueFactory<>("jobId")
        );

        jobTitleTC.setCellValueFactory(
                new PropertyValueFactory<>("jobTitle")
        );

        companyNameTC.setCellValueFactory(
                new PropertyValueFactory<>("companyName")
        );

        applicationDeadlineTC.setCellValueFactory(
                new PropertyValueFactory<>("applicationDeadline")
        );


        jobList =
                databaseAccessor.readObject("Job.bin");

        if (jobList == null) {
            jobList = FXCollections.observableArrayList();
        }

        recommendedJobsTV.setItems(jobList);
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}