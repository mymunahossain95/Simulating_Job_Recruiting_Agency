package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class VerificationRequest implements Serializable {
    private int requestId;
    private Candidate candidate;
    private String verificationType, status,remarks;
    private LocalDate submissionDate;

    public VerificationRequest(int requestId, Candidate candidate, String verificationType, LocalDate submissionDate, String status, String remarks) {
        this.requestId = requestId;
        this.candidate = candidate;
        this.verificationType = verificationType;
        this.submissionDate = submissionDate;
        this.status = status;
        this.remarks = remarks;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "VerificationRequest{" +
                "requestId=" + requestId +
                ", candidate=" + candidate +
                ", verificationType='" + verificationType + '\'' +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
