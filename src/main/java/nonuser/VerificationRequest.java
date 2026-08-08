package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class VerificationRequest implements Serializable {
    private int requestId;
    private int candidateId;
    private String candidateName;
    private String verificationType;
    private String status;

    public VerificationRequest() {
    }

    public VerificationRequest(int requestId, int candidateId, String candidateName, String verificationType, String status) {
        this.requestId = requestId;
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.verificationType = verificationType;
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VerificationRequest{" +
                "requestId=" + requestId +
                ", candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", verificationType='" + verificationType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
