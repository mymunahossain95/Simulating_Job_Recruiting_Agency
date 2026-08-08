package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import nonuser.HiringDecision;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class HiringDecisionViewController {

    @javafx.fxml.FXML
    private TextField candidateIdTF;

    @javafx.fxml.FXML
    private TextField candidateNameCB;

    @javafx.fxml.FXML
    private ComboBox<String> hiringDecisionCB;

    @javafx.fxml.FXML
    private TextField remarkTF;

    @javafx.fxml.FXML
    private Label statusForHiringDecisionLabel;


    @javafx.fxml.FXML
    public void initialize() {

        hiringDecisionCB.getItems().addAll(
                "Selected",
                "Rejected"
        );
    }


    @javafx.fxml.FXML
    public void saveDecisionOA(ActionEvent actionEvent) {

        if (candidateIdTF.getText().isEmpty()
                || candidateNameCB.getText().isEmpty()
                || hiringDecisionCB.getValue() == null
                || remarkTF.getText().isEmpty()) {

            AlertGenerator.showWarningAlert(
                    "Missing Information",
                    "Please fill all required fields."
            );

            return;
        }


        HiringDecision hiringDecision =
                new HiringDecision(
                        candidateIdTF.getText(),
                        candidateNameCB.getText(),
                        hiringDecisionCB.getValue(),
                        remarkTF.getText()
                );


        ObservableList<HiringDecision> decisionList =
                databaseAccessor.readObject("HiringDecision.bin");


        if (decisionList == null) {
            decisionList = FXCollections.observableArrayList();
        }


        decisionList.add(hiringDecision);


        databaseAccessor.writeObject(
                "HiringDecision.bin",
                decisionList
        );


        statusForHiringDecisionLabel.setText(
                "Hiring Decision Saved Successfully"
        );


        AlertGenerator.showInformationAlert(
                "Decision Saved",
                "Hiring decision saved successfully."
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/Employer/EmployerDashboardView.fxml"
        );
    }
}
