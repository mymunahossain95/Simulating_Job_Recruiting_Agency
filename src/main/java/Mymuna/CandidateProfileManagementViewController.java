package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import nonuser.Resume;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CandidateProfileManagementViewController {

    @javafx.fxml.FXML
    private TextField nameTF;

    @javafx.fxml.FXML
    private TextField phoneTF;

    @javafx.fxml.FXML
    private TextField skillsTF;

    @javafx.fxml.FXML
    private TextField emailTF;

    @javafx.fxml.FXML
    private TextField educationDetailTF;

    @javafx.fxml.FXML
    private TextField workExperienceTF;

    @javafx.fxml.FXML
    private TextField careerObjectiveTF;

    @javafx.fxml.FXML
    private ComboBox<String> preferredJobCategoryCB;

    @javafx.fxml.FXML
    private TextField expectedSalaryTF;

    @javafx.fxml.FXML
    private Label statusForCandidateProfileManagementLabel;


    @javafx.fxml.FXML
    public void initialize() {

        preferredJobCategoryCB.getItems().addAll(
                "IT",
                "Finance",
                "Marketing",
                "Human Resources",
                "Engineering"
        );
    }


    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {

        Resume resume = new Resume(
                nameTF.getText(),
                emailTF.getText(),
                careerObjectiveTF.getText(),
                educationDetailTF.getText(),
                skillsTF.getText(),
                workExperienceTF.getText(),
                preferredJobCategoryCB.getValue(),
                expectedSalaryTF.getText(),
                phoneTF.getText()
        );

        ObservableList<Resume> resumeList =
                databaseAccessor.readObject("Resume.bin");

        if (resumeList == null) {
            resumeList = FXCollections.observableArrayList();
        }

        resumeList.add(resume);

        databaseAccessor.writeObject(
                "Resume.bin",
                resumeList
        );

        statusForCandidateProfileManagementLabel.setText(
                "Resume Saved Successfully"
        );

        AlertGenerator.showInformationAlert(
                "Saved",
                "Resume saved successfully."
        );
    }


    @javafx.fxml.FXML
    public void editOA(ActionEvent actionEvent) {

        statusForCandidateProfileManagementLabel.setText(
                "Profile Ready to Edit"
        );
    }


    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {

        SceneSwitchingHelper.switchScene(
                actionEvent,
                "/JobSeeker/JobSeekerDashboardView.fxml"
        );
    }
}