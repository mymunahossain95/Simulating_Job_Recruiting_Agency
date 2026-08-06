package nonuser;

import java.io.Serializable;

public class JobApplication implements Serializable {

    private String applicationId;
    private String candidateId;
    private String candidateName;
    private String jobId;
    private String jobTitle;
    private String companyName;
    private String coverLetter;
    private String availabilityToJoin;
    private String appliedDate;
    private String applicationStatus;

    public JobApplication(String applicationId,
                          String candidateId,
                          String candidateName,
                          String jobId,
                          String jobTitle,
                          String companyName,
                          String coverLetter,
                          String availabilityToJoin,
                          String appliedDate,
                          String applicationStatus) {

        this.applicationId = applicationId;
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.coverLetter = coverLetter;
        this.availabilityToJoin = availabilityToJoin;
        this.appliedDate = appliedDate;
        this.applicationStatus = applicationStatus;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getAvailabilityToJoin() {
        return availabilityToJoin;
    }

    public void setAvailabilityToJoin(String availabilityToJoin) {
        this.availabilityToJoin = availabilityToJoin;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "applicationId='" + applicationId + '\'' +
                ", candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", jobId='" + jobId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", coverLetter='" + coverLetter + '\'' +
                ", availabilityToJoin='" + availabilityToJoin + '\'' +
                ", appliedDate='" + appliedDate + '\'' +
                ", applicationStatus='" + applicationStatus + '\'' +
                '}';
    }
}