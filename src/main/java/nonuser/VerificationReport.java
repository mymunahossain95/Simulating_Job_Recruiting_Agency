package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class VerificationReport implements Serializable {
    private int reportId;
    private Candidate candidate;
    private String ageStatus,educationStatus,identityStatus,finalStatus,reportDate;
    public VerificationReport(int reportId, Candidate candidate, String ageStatus, String educationStatus, String jobRequirementStatus, String identityStatus, String finalStatus, LocalDate reportDate) {
        this.reportId = reportId;
        this.candidate = candidate;
        this.ageStatus = ageStatus;
        this.educationStatus = educationStatus;
        this.jobRequirementStatus = jobRequirementStatus;
        this.identityStatus = identityStatus;
        this.finalStatus = finalStatus;
        this.reportDate = reportDate;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getAgeStatus() {
        return ageStatus;
    }

    public void setAgeStatus(String ageStatus) {
        this.ageStatus = ageStatus;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
    }

    public String getJobRequirementStatus() {
        return jobRequirementStatus;
    }

    public void setJobRequirementStatus(String jobRequirementStatus) {
        this.jobRequirementStatus = jobRequirementStatus;
    }

    public String getIdentityStatus() {
        return identityStatus;
    }

    public void setIdentityStatus(String identityStatus) {
        this.identityStatus = identityStatus;
    }

    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "VerificationReport{" +
                "reportId=" + reportId +
                ", candidate=" + candidate +
                ", ageStatus='" + ageStatus + '\'' +
                ", educationStatus='" + educationStatus + '\'' +
                ", jobRequirementStatus='" + jobRequirementStatus + '\'' +
                ", identityStatus='" + identityStatus + '\'' +
                ", finalStatus='" + finalStatus + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}
