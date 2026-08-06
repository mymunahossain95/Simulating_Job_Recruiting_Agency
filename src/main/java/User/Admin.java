package User;

import java.io.Serializable;
import java.time.LocalDate;

public class Admin extends User implements Serializable {

    private final String adminId;

    public Admin(
            String userId,
            String adminId,
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

        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}