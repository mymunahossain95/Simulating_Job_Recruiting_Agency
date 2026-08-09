package com.example.simulating_job_recruiting_agency;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import utility.AlertGenerator;
import utility.SceneSwitchingHelper;


public class LoginViewController {
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleLoginViewButtonOnAction(ActionEvent actionEvent) {


        if (userNameTextField.getText().isEmpty() || userPasswordTextField.getText().isEmpty()) {
            AlertGenerator.showWarningAlert("Invalid Input", "Username and password are required.");
            return;
        }


        if (userNameTextField.getText().equals("jobseeker") && userPasswordTextField.getText().equals("job6787")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Mymuna/JobSeekerDashboard.fxml");


        } else if (userNameTextField.getText().equals("employer") && userPasswordTextField.getText().equals("emp189923")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Mymuna/EmployerDashboard.fxml");


        } else if (userNameTextField.getText().equals("counselor") && userPasswordTextField.getText().equals("counselour18363")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Nazila/CareerCounselorDashboard.fxml");


        } else if (userNameTextField.getText().equals("verifier") && userPasswordTextField.getText().equals("verifier1457823")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Nazila/DocumentVerifierDashboard.fxml");


        } else if (userNameTextField.getText().equals("skillOfficer") && userPasswordTextField.getText().equals("skill647123")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Ridwan/SkillAssessmentOfficerDashboard.fxml");


        } else if (userNameTextField.getText().equals("interviewCoordinator") && userPasswordTextField.getText().equals("interview1575823")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Ridwan/InterviewCoordinatorDashboard.fxml");


        } else if (userNameTextField.getText().equals("reports") && userPasswordTextField.getText().equals("reports1787823")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Utsita/ReportsAndAnalyticsDashboard.fxml");


        } else if (userNameTextField.getText().equals("training") && userPasswordTextField.getText().equals("training167723")) {

            SceneSwitchingHelper.switchScene(actionEvent, "/Utsita/TrainingCoordinatorDashboard.fxml");


        } else if (userNameTextField.getText().equals("admin") && userPasswordTextField.getText().equals("admin1677823")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Prottoy/AdminDashboard.fxml");


        } else if (userNameTextField.getText().equals("finance") && userPasswordTextField.getText().equals("finance166723")) {
            SceneSwitchingHelper.switchScene(actionEvent, "/Prottoy/FinanceOfficerDashboard.fxml");

        } else {
            AlertGenerator.showWarningAlert("Login Failed", "Invalid username or password.");
        }
        if (!userNameTextField.getText().matches("[a-z]+")) {
            AlertGenerator.showWarningAlert("Invalid Username", "Username must contain lowercase letters only.");
            return;
        }
    }

    @javafx.fxml.FXML
    public void logInButton(ActionEvent actionEvent) {
    }
}
