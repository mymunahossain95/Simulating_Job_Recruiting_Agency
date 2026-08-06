package User;

import java.io.Serializable;
import java.time.LocalDate;

public class CareerCounselor extends User implements Serializable {
    public CareerCounselor(String password, String fullName, String role,
                           LocalDate dateOfBirth, String gender, String email,
                           String phone, String address, String status) {

        super(password, fullName, role, dateOfBirth, gender,
                email, phone, address, status);
    }
    @Override
    public void viewDashboard(ActionEvent event, User user) {
        SceneSwitchingHelper.switchSceneWithData(
                event,
                "/com/example/simulating_job_recruiting_agency/CareerCounselor/CareerCounselorDashboard.fxml",
                user
        );
    }


}
