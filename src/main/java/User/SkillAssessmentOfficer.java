package User;

import java.io.Serializable;
import java.time.LocalDate;

public class SkillAssessmentOfficer extends User implements Serializable {
    private String department;


    public SkillAssessmentOfficer(
            String userId,
            String fullName,
            String email,
            String password,
            LocalDate dateOfBirth,
            String phone,
            String address,
            String status,
            String department) {

        super(
                userId,
                fullName,
                email,
                password,
                dateOfBirth,
                phone,
                address,
                status
        );

        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "SkillAssessmentOfficer{" +
                "department='" + department + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}