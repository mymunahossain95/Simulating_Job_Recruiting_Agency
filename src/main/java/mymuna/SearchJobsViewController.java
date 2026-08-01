package mymuna;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SearchJobsViewController {
    @javafx.fxml.FXML
    private TextField keyWordTF;
    @javafx.fxml.FXML
    private ComboBox locationTF;
    @javafx.fxml.FXML
    private TableColumn jobIdTC;
    @javafx.fxml.FXML
    private TableColumn locationTC;
    @javafx.fxml.FXML
    private TableColumn salaryTC;
    @javafx.fxml.FXML
    private TableView searchJobTV;
    @javafx.fxml.FXML
    private TableColumn companyTC;
    @javafx.fxml.FXML
    private ComboBox categoryTF;
    @javafx.fxml.FXML
    private TableColumn deadLineTC;
    @javafx.fxml.FXML
    private TableColumn jobTitleTC;

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
    }
}
