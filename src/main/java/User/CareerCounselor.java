package User;

import nonuser.Job;
import nonuser.TrainingCourse;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class CareerCounselor extends User implements Serializable {

    private final String counselorId;

    public CareerCounselor(String userId, String counselorId, String fullName,
                           String email, String password, LocalDate dateOfBirth,
                           String phone, String address, String status) {

        super(userId, fullName, email, password, dateOfBirth, phone, address, status);

        this.counselorId = counselorId;
    }

    public String getCounselorId() {
        return counselorId;
    }

    public void provideCareerGuidance() {

    }

    public void processAssistanceRequest() {

    }

    public void conductCounselingSession() {

    }

    public ArrayList<Job> recommendJob() {
        return new ArrayList<>();
    }

    public ArrayList<TrainingCourse> recommendTraining() {
        return new ArrayList<>();
    }

    public void reviewResume() {

    }

    public void provideInterviewGuidance() {

    }

    public void trackCandidate() {

    }
    @Override
    public String toString() {
        return "CareerCounselor{" +
                "counselorId='" + counselorId + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}
