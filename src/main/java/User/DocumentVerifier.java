package User;

import java.io.Serializable;
import java.time.LocalDate;

public class DocumentVerifier extends User implements Serializable {

    private final String verifierId;

    public DocumentVerifier(String userId, String verifierId, String fullName,
            String email, String password, LocalDate dateOfBirth, String phone,
            String address, String status) {

        super(userId, fullName, email, password, dateOfBirth, phone, address, status
        );

        this.verifierId = verifierId;
    }

    public String getVerifierId() {
        return verifierId;
    }

    @Override
    public String toString() {
        return "DocumentVerifier{" +
                "verifierId='" + verifierId + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}
