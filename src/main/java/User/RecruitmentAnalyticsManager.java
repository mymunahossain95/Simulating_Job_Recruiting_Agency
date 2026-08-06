package User;

import java.io.Serializable;
import java.time.LocalDate;

public class RecruitmentAnalyticsManager extends User implements Serializable {
    private final String managerId;

    public RecruitmentAnalyticsManager(
            String userId,
            String managerId,
            String fullName,
            String email,
            String password,
            LocalDate dateOfBirth,
            String phone,
            String address,
            String status) {

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

        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    @Override
    public String toString() {
        return "RecruitmentAnalyticsManager{" +
                "managerId='" + managerId + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}
