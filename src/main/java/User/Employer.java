package User;

import java.io.Serializable;
import java.time.LocalDate;

public class Employer extends User implements Serializable {

    private String companyId;

    public Employer(String userId,
                    String fullName,
                    String email,
                    String password,
                    LocalDate dateOfBirth,
                    String phone,
                    String address,
                    String status,
                    String companyId) {

        super(userId, fullName, email, password,
                dateOfBirth, phone, address, status);

        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "companyId='" + companyId + '\'' +
                ", " + super.toString() +
                '}';
    }
}