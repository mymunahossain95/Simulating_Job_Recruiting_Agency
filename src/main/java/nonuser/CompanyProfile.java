package nonuser;

import java.io.Serializable;

public class CompanyProfile implements Serializable {

    private String companyId;
    private String companyName;
    private String companyAddress;
    private String companyEmail;
    private String contactNumber;

    public CompanyProfile(String companyId,
                          String companyName,
                          String companyAddress,
                          String companyEmail,
                          String contactNumber) {

        this.companyId = companyId;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyEmail = companyEmail;
        this.contactNumber = contactNumber;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
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

    @Override
    public String toString() {
        return "CompanyProfile{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
