package mymuna;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class EditJobVacancyViewController {
    @javafx.fxml.FXML
    private TableColumn deadlineTC;
    @javafx.fxml.FXML
    private TableColumn jobIdTC;
    @javafx.fxml.FXML
    private TextField jobDescriptionTF;
    @javafx.fxml.FXML
    private DatePicker deadlineDP;
    @javafx.fxml.FXML
    private TextField salaryTF;
    @javafx.fxml.FXML
    private TextField jobTitleTF;
    @javafx.fxml.FXML
    private Label statusForEditJobVacancyLabel;
    @javafx.fxml.FXML
    private TableView editJobVacancyTV;
    @javafx.fxml.FXML
    private TableColumn jobStatusTC;
    @javafx.fxml.FXML
    private TableColumn jobTitleTC;

    @javafx.fxml.FXML
    public void updateJobOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOA(ActionEvent actionEvent) {
    }
}
