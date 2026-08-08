package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.JobApplication;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class ReviewApplicationsViewController {

    @javafx.fxml.FXML
    private TableView<JobApplication> reviewApplicationsTV;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> candidateNameTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> jobIdTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> applicationStatusTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> jobTitleTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> applicationIdTC;

    private ObservableList<JobApplication> applicationList;

    @javafx.fxml.FXML
    public void initialize() {

        applicationIdTC.setCellValueFactory(
                new PropertyValueFactory<>("applicationId")
        );

        candidateNameTC.setCellValueFactory(
                new PropertyValueFactory<>("candidateName")
        );

        jobIdTC.setCellValueFactory(
                new PropertyValueFactory<>("jobId")
        );

        jobTitleTC.setCellValueFactory(
                new PropertyValueFactory<>("jobTitle")
        );

        applicationStatusTC.setCellValueFactory(
                new PropertyValueFactory<>("applicationStatus")
        );

        applicationList =
                databaseAccessor.readObject("JobApplication.bin");

        if (applicationList == null) {
            applicationList = FXCollections.observableArrayList();
        }

        reviewApplicationsTV.setItems(applicationList);
    }

    @javafx.fxml.FXML
    public void refreshOA(ActionEvent actionEvent) {

        applicationList =
                databaseAccessor.readObject("JobApplication.bin");

        reviewApplicationsTV.setItems(applicationList);
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Employer/EmployerDashboardView.fxml"
        );
    }
}
