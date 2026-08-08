package Mymuna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import nonuser.CompanyProfile;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;
import utility.databaseAccessor;

public class CompanyRegistrationViewController {

    @javafx.fxml.FXML
    private TextField contactNumberTF;

    @javafx.fxml.FXML
    private TextField companyNameTF;

    @javafx.fxml.FXML
    private TextField addressTF;

    @javafx.fxml.FXML
    private Label statusForCompanyResistationLabel;

    @javafx.fxml.FXML
    private TextField emailAddressTF;

    @javafx.fxml.FXML
    private TextField companyIdTF;


    @javafx.fxml.FXML
    public void createProfileOA(ActionEvent actionEvent) {

        if (companyIdTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter company ID.");
            return;
        }
        if (companyNameTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter company name.");
            return;
        }
        if (addressTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter address.");
            return;
        }

        if (emailAddressTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter email address.");
            return;
        }

        if (contactNumberTF.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Missing Information", "Please enter contact number.");
            return;
        }

        if (!emailAddressTF.getText().contains("@")) {
            AlertGenerator.showWarningAlert("Invalid Email", "Please enter a valid email.");
            return;
        }

        if (!emailAddressTF.getText().contains("@")) {

            AlertGenerator.showWarningAlert("Invalid Email", "Please enter a valid email.");
            return;
        }

        CompanyProfile companyProfile =
                new CompanyProfile(
                        companyIdTF.getText(),
                        companyNameTF.getText(),
                        addressTF.getText(),
                        emailAddressTF.getText(),
                        contactNumberTF.getText()
                );

        ObservableList<CompanyProfile> companyList =
                databaseAccessor.readObject("CompanyProfile.bin");

        if (companyList == null) {
            companyList = FXCollections.observableArrayList();
        }

        companyList.add(companyProfile);

        databaseAccessor.writeObject(
                "CompanyProfile.bin",
                companyList
        );

        statusForCompanyResistationLabel.setText(
                "Company Profile Created Successfully"
        );

        AlertGenerator.showInformationAlert(
                "Profile Created",
                "Company Profile Created Successfully"
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