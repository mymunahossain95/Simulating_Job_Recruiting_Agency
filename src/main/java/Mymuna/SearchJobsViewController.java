package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import nonuser.Job;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class SearchJobsViewController {
    @javafx.fxml.FXML private ComboBox<String> locationTF;
    @javafx.fxml.FXML private TableColumn<Job, String> jobIdTC;
    @javafx.fxml.FXML private TableColumn<Job, String> locationTC;
    @javafx.fxml.FXML private TableColumn<Job, String> salaryTC;
    @javafx.fxml.FXML private TableView<Job> searchJobTV;
    @javafx.fxml.FXML private TableColumn<Job, String> companyTC;
    @javafx.fxml.FXML private ComboBox<String> categoryTF;
    @javafx.fxml.FXML private TableColumn<Job, String> deadLineTC;
    @javafx.fxml.FXML private TableColumn<Job, String> jobTitleTC;
    @javafx.fxml.FXML private TextField jobTitleTF;
    private ObservableList<Job> jobList;

    @javafx.fxml.FXML
    public void initialize() {

        categoryTF.getItems().addAll(
                "IT",
                "Finance",
                "Marketing",
                "HR",
                "Engineering"
        );

        locationTF.getItems().addAll(
                "Dhaka",
                "Chattogram",
                "Khulna",
                "Rajshahi",
                "Sylhet"
        );

        jobIdTC.setCellValueFactory(new PropertyValueFactory<>("jobId"));
        jobTitleTC.setCellValueFactory(new PropertyValueFactory<>("jobTitle"));
        companyTC.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        locationTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        salaryTC.setCellValueFactory(new PropertyValueFactory<>("salary"));
        deadLineTC.setCellValueFactory(new PropertyValueFactory<>("applicationDeadline"));
        jobList = databaseAccessor.readObject("Job.bin");

        if (jobList == null) {
            jobList = FXCollections.observableArrayList();
        }

        searchJobTV.setItems(jobList);
    }


    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {

        jobList =
                databaseAccessor.readObject("Job.bin");

        if (jobList == null) {
            jobList = FXCollections.observableArrayList();
        }

        searchJobTV.setItems(jobList);
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}
