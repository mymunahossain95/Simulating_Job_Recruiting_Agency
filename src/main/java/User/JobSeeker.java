package User;

import java.io.Serializable;
import java.time.LocalDate;

public class JobSeeker extends User implements Serializable {

    private String resumeId;

    public JobSeeker(String userId,
                     String fullName,
                     String email,
                     String password,
                     LocalDate dateOfBirth,
                     String phone,
                     String address,
                     String status,
                     String resumeId) {

        super(userId, fullName, email, password,
                dateOfBirth, phone, address, status);

        this.resumeId = resumeId;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    @Override
    public String toString() {
        return "JobSeeker{" +
                "resumeId='" + resumeId + '\'' +
                ", " + super.toString() +
                '}';
    }
}