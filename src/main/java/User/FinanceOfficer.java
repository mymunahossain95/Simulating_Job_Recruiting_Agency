package User;

import java.io.Serializable;
import java.time.LocalDate;

public class FinanceOfficer extends User implements Serializable {

    private final String financeOfficerId;

    public FinanceOfficer(
            String userId,
            String financeOfficerId,
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

        this.financeOfficerId = financeOfficerId;
    }

    public String getFinanceOfficerId() {
        return financeOfficerId;
    }

    @Override
    public String toString() {
        return "FinanceOfficer{" +
                "financeOfficerId='" + financeOfficerId + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}