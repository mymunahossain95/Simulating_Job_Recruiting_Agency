package Prottoy;

import javafx.event.ActionEvent;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class AdminDashboardController {

    @javafx.fxml.FXML
    public void onManageUsers(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/ManageUserAccounts.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onPendingRegistrations(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/PendingRegistrations.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onManageCategories(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/ManageJobCategories.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onReports(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/Reports.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onComplaints(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/ComplaintManagement.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onSettings(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/SystemSettings.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onActivityLogs(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/ActivityLogs.fxml"
        );
    }

    @javafx.fxml.FXML
    public void onBackup(ActionEvent actionEvent) throws IOException {
        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Admin/BackupManagement.fxml"
        );
    }

    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {
        //SceneSwitchingHelper.switchScene(
                //actionEvent,
                //"/Common/Login.fxml"
        //);
    //}
}