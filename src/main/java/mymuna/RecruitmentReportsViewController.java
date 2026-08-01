package mymuna;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class RecruitmentReportsViewController {
    @javafx.fxml.FXML
    private TableColumn successRateTC;
    @javafx.fxml.FXML
    private AnchorPane endDateDP;
    @javafx.fxml.FXML
    private TableColumn totalApplicationsTC;
    @javafx.fxml.FXML
    private TableColumn totalInterviewsTC;
    @javafx.fxml.FXML
    private TableColumn totalJobsTC;
    @javafx.fxml.FXML
    private TableColumn totalHiresTC;
    @javafx.fxml.FXML
    private TableView recrutmentReportsTV;
    @javafx.fxml.FXML
    private ComboBox reportTypeCB;
    @javafx.fxml.FXML
    private DatePicker startDateDP;

    @javafx.fxml.FXML
    public void exportReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOA(ActionEvent actionEvent) {
    }
}
