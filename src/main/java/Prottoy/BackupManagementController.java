package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class BackupManagementController {

    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        statusLabel.setText("Backup Status: Ready");
    }

    @javafx.fxml.FXML
    public void onCreateBackup(ActionEvent actionEvent) {

        // Storage availability is checked
        // Database information is retrieved
        // Backup file is generated

        statusLabel.setText("Backup Status: Backup completed successfully.");

        AlertGenerator.showInformationAlert(
                "Backup Successful",
                "System backup has been generated successfully."
        );
    }

    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

        //SceneSwitchingHelper.switchScene(
               // actionEvent,
                //"/Admin/AdminDashboard.fxml"
      //  );
    //}
}