package nonuser;

import java.io.Serializable;

public class AssignCandidates implements Serializable {
    private final String candidateId;
    private String candidateName;
    private String skills;
    private String status;

    public AssignCandidates(String candidateId,
                               String candidateName,
                               String skills,
                               String status) {

        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.skills = skills;
        this.status = status;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSkills() {
        return skills;
    }

    public String getStatus() {
        return status;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CandidateAssignment{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", skills='" + skills + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
