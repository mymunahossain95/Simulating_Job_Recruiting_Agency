package User;

import java.io.Serializable;

public class Employer implements Serializable {

    private String employerId;
    private String companyName;
    private String companyEmail;
    private String contactNumber;
    private String password;

    public Employer(String employerId, String companyName, String companyEmail, String contactNumber, String password) {
        this.employerId = employerId;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.contactNumber = contactNumber;
        this.password = password;
    }

    public String getEmployerId() {
        return employerId;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "employerId='" + employerId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
