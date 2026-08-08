package Prottoy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import nonuser.ActivityLog;
import utility.AlertGenerator;
import utility.databaseAccessor;
import utility.SceneSwitchingHelper;

public class ActivityLogsController {

    @javafx.fxml.FXML
    private DatePicker fromDate;

    @javafx.fxml.FXML
    private DatePicker toDate;

    @javafx.fxml.FXML
    private TextField userIdField;

    @javafx.fxml.FXML
    private TableView<ActivityLog> activityTable;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> activityIdTableColumn;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> userIdTableColumn;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> userNameTableColumn;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> activityTableColumn;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> dateTableColumn;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> timeTableColumn;

    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> statusTableColumn;

    private ObservableList<ActivityLog> activityList;


    @javafx.fxml.FXML
    public void initialize() {

        activityIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("activityId"));

        userIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("userId"));

        userNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("userName"));

        activityTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("activity"));

        dateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        timeTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("time"));

        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));


        activityList =
                databaseAccessor.readObject("ActivityLog.bin");

        if (activityList == null) {
            activityList = FXCollections.observableArrayList();
        }

        activityTable.setItems(activityList);
    }


    @javafx.fxml.FXML
    public void onFilter(ActionEvent actionEvent) {

        if (fromDate.getValue() == null &&
                toDate.getValue() == null &&
                userIdField.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Filter",
                    "Please provide a filter."
            );

            return;
        }


        if (fromDate.getValue() != null &&
                toDate.getValue() != null &&
                fromDate.getValue().isAfter(toDate.getValue())) {

            AlertGenerator.showWarningAlert(
                    "Invalid Date",
                    "From date cannot be after To date."
            );

            return;
        }


        // Filtered records are displayed
        activityTable.setItems(activityList);

        AlertGenerator.showInformationAlert(
                "Activity Logs",
                "Activity logs filtered successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) {

        //SceneSwitchingHelper.switchScene(
                //actionEvent,
                //"/Prottoy/AdminDashboard.fxml"
        //);
    //}
}