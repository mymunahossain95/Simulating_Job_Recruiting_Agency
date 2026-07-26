module com.example.simulating_job_recruiting_agency {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.simulating_job_recruiting_agency to javafx.fxml;
    exports com.example.simulating_job_recruiting_agency;
}