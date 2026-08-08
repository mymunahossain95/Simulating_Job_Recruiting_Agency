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

    @Deprecated
    public void logInButton(ActionEvent actionEvent) {

        String username = userNameTextField.getText();
        String password = passwordTextField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            AlertGenerator.showWarningAlert(
                    "Invalid Input",
                    "Username and password are required."
            );
            return;
        }

        if (username.equals("jobseeker")
                && password.equals("job6787")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/JobSeeker/JobSeekerDashboard.fxml"
            );

        }

        else if (username.equals("employer")
                && password.equals("emp189923")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/Employer/EmployerDashboard.fxml"
            );

        }

        // User-3: Career Counselor
        else if (username.equals("counselor")
                && password.equals("counselor18363")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/CareerCounselor/CareerCounselorDashboard.fxml"
            );

        }

        else if (username.equals("verifier")
                && password.equals("verifier1457823")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/DocumentVerifier/DocumentVerifierDashboard.fxml"
            );

        }

        else if (username.equals("skillOfficer")
                && password.equals("skill647123")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/SkillAssessmentOfficer/SkillAssessmentOfficerDashboard.fxml"
            );

        }

        else if (username.equals("interviewCoordinator")
                && password.equals("interview1575823")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/InterviewCoordinator/InterviewCoordinatorDashboard.fxml"
            );

        }

        else if (username.equals("reports")
                && password.equals("reports1787823")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/RecruitmentAnalyticsManager/ReportAnalyticsDashboard.fxml"
            );

        }

        // User-8: Training Coordinator
        else if (username.equals("training")
                && password.equals("training167723")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/TrainingCoordinator/TrainingCoordinatorDashboard.fxml"
            );

        }

        else if (username.equals("admin")
                && password.equals("admin1677823")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/Admin/AdminDashboard.fxml"
            );

        }

        else if (username.equals("finance")
                && password.equals("finance166723")) {

            SceneSwitchingHelper.switchScene(
                    actionEvent,
                    "/com.example.simulating_job_recruiting_agency/Finance Officer/FinanceOfficerDashboard.fxml"
            );

        }

        // Wrong username/password
        else {
            AlertGenerator.showWarningAlert(
                    "Login Failed",
                    "Invalid username or password."
            );
        }
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {
    }
}