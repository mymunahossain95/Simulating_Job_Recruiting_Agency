package Prottoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import nonuser.Complaint;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;

import java.io.IOException;

public class ComplaintManagementController {

    @javafx.fxml.FXML
    private TableView<Complaint> complaintTable;

    @javafx.fxml.FXML
    private TableColumn<Complaint, String> ComplaintIdColumnTable;

    @javafx.fxml.FXML
    private TableColumn<Complaint, String> UserColumnTable;

    @javafx.fxml.FXML
    private TableColumn<Complaint, String> StatusColumnTable;

    @javafx.fxml.FXML
    private TextField ResolutionTextField;


    @javafx.fxml.FXML
    public void initialize() {

        // Table data will be connected here later
    }


    @javafx.fxml.FXML
    public void onResolve(ActionEvent actionEvent) {

        if (complaintTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Resolve Complaint",
                    "Please select a complaint first."
            );

            return;
        }

        if (ResolutionTextField.getText().trim().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Resolution",
                    "Please enter a resolution."
            );

            return;
        }


        // Store resolution details
        // Update complaint status to Resolved

        AlertGenerator.showInformationAlert(
                "Success",
                "Complaint resolved successfully."
        );
    }


    @javafx.fxml.FXML
    public void onClose(ActionEvent actionEvent) {

        if (complaintTable.getSelectionModel().getSelectedItem() == null) {

            AlertGenerator.showWarningAlert(
                    "Close Complaint",
                    "Please select a complaint first."
            );

            return;
        }


        // Update complaint status to Closed

        AlertGenerator.showInformationAlert(
                "Success",
                "Complaint closed successfully."
        );
    }


    //@javafx.fxml.FXML
    //public void onBack(ActionEvent actionEvent) throws IOException {

        //SceneSwitchingHelper.switchScene(
               // actionEvent,
                //"/Admin/AdminDashboard.fxml"
        //);
   // }
}