package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.JobApplication;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class TrackApplicationsViewController {

    @javafx.fxml.FXML
    private TableView<JobApplication> trackApplicationsTV;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> companyTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> statusTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> applicationIdTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> jobTitleTC;

    @javafx.fxml.FXML
    private TableColumn<JobApplication, String> appliedDateTC;

    @javafx.fxml.FXML
    private Label statusForTrackApplicationLabel;


    @javafx.fxml.FXML
    public void initialize() {

        applicationIdTC.setCellValueFactory(new PropertyValueFactory<>("applicationId"));
        jobTitleTC.setCellValueFactory(new PropertyValueFactory<>("jobTitle"));
        companyTC.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        appliedDateTC.setCellValueFactory(new PropertyValueFactory<>("appliedDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("applicationStatus"));


        ObservableList<JobApplication> applicationList =
                databaseAccessor.readObject("JobApplication.bin");

        if (applicationList == null) {
            applicationList = FXCollections.observableArrayList();
        }

        trackApplicationsTV.setItems(applicationList);

        statusForTrackApplicationLabel.setText(
                "Applications Loaded"
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