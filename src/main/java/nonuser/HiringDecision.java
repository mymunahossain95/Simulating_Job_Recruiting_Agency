package nonuser;

import java.io.Serializable;

public class HiringDecision implements Serializable {

    private String candidateId;
    private String candidateName;
    private String decision;
    private String remarks;

    public HiringDecision(String candidateId,
                          String candidateName,
                          String decision,
                          String remarks) {

        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.decision = decision;
        this.remarks = remarks;
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

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "HiringDecision{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", decision='" + decision + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}