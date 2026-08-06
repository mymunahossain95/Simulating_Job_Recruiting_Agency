package nonuser;

import java.io.Serializable;

public class JobOffer implements Serializable {

    private String offerId;
    private String companyName;
    private String position;
    private String salary;
    private String joiningDate;
    private String benefits;
    private String responseStatus;

    public JobOffer(String offerId, String companyName, String position, String salary, String joiningDate, String benefits, String responseStatus) {
        this.offerId = offerId;
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.benefits = benefits;
        this.responseStatus = responseStatus;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "offerId='" + offerId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", benefits='" + benefits + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                '}';
    }
}
