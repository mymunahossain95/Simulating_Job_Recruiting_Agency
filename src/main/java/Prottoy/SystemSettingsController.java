package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class SystemSettingsController {

    @javafx.fxml.FXML
    private TextField settingValueField;

    @javafx.fxml.FXML
    private ComboBox<String> settingTypeCombo;


    @javafx.fxml.FXML
    public void initialize() {

        settingTypeCombo.getItems().addAll(
                "System Name",
                "Email",
                "Password Policy",
                "User Registration",
                "Maintenance Mode"
        );
    }


    @javafx.fxml.FXML
    public void settingTypeCombo(ActionEvent actionEvent) {

        // Setting type selected
    }


    @javafx.fxml.FXML
    public void onSaveSettings(ActionEvent actionEvent) {

        if (settingTypeCombo.getValue() == null) {

            AlertGenerator.showWarningAlert(
                    "System Settings",
                    "Please select a setting type."
            );

            return;
        }

        if (settingValueField.getText().trim().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "System Settings",
                    "Please enter a value."
            );

            return;
        }


        // Validate updated setting
        // Verify admin authorization
        // Update setting

        AlertGenerator.showInformationAlert(
                "Success",
                "System settings updated successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

        //SceneSwitchingHelper.switchScene(
          //      actionEvent,
            //    "/Admin/AdminDashboard.fxml"
        //);
    //}
}