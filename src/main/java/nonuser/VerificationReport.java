package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class VerificationReport implements Serializable {
    private String candidateId;
    private String candidateName;
    private String appliedJob;
    private String eligibility;
    private String finalDecision;

    public VerificationReport() {
    }

    public VerificationReport(String candidateId, String candidateName, String appliedJob, String eligibility, String finalDecision) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.appliedJob = appliedJob;
        this.eligibility = eligibility;
        this.finalDecision = finalDecision;
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

    public String getAppliedJob() {
        return appliedJob;
    }

    public void setAppliedJob(String appliedJob) {
        this.appliedJob = appliedJob;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    @Override
    public String toString() {
        return "VerificationReport{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", appliedJob='" + appliedJob + '\'' +
                ", eligibility='" + eligibility + '\'' +
                ", finalDecision='" + finalDecision + '\'' +
                '}';
    }
}
