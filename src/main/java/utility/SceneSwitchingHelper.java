package utility;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitchingHelper {

    public static void switchScene(ActionEvent event, String fxmlFile) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    SceneSwitchingHelper.class.getResource(fxmlFile)
            );

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene = new Scene(root);

            stage.setScene(scene);

            stage.show();

        } catch (IOException e) {

            AlertGenerator.showErrorAlert(
                    "Scene Error",
                    "Unable to open " + fxmlFile
            );
        }
    }
}