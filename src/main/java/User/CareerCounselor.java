package User;

import java.io.Serializable;
import java.time.LocalDate;

public class CareerCounselor extends User implements Serializable {

    private final String counselorId;

    public CareerCounselor(String userId, String counselorId, String fullName,
                           String email, String password, LocalDate dateOfBirth,
                           String phone, String address, String status) {

        super(userId, fullName, email, password, dateOfBirth, phone, address, status
        );

        this.counselorId = counselorId;
    }

    public String getCounselorId() {
        return counselorId;
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
