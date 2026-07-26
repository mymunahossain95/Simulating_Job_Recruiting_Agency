package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RecommendedJobsViewController {
    @javafx.fxml.FXML
    private TableColumn jobIdTC;
    @javafx.fxml.FXML
    private TableColumn matchPercentageTC;
    @javafx.fxml.FXML
    private TableColumn applixationDeadlineTC;
    @javafx.fxml.FXML
    private TableView recommendedJobsTV;
    @javafx.fxml.FXML
    private TableColumn companyNameTC;
    @javafx.fxml.FXML
    private TableColumn jobTitleTC;

    @javafx.fxml.FXML
    public void viewJobDetailsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyNowOA(ActionEvent actionEvent) {
    }
}
