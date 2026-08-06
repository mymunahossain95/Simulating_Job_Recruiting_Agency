package nonuser;

import java.io.Serializable;

public class InterviewOutcome implements Serializable {

    private String candidateName;
    private double score;
    private String decision;
    private String remarks;
    private String interviewId;


    public InterviewOutcome(String candidateName, double score, String decision, String remarks, String interviewId) {
        this.candidateName = candidateName;
        this.score = score;
        this.decision = decision;
        this.remarks = remarks;
        this.interviewId = interviewId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
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

    public String getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    @Override
    public String toString() {
        return "InterviewOutcome{" +
                "candidateName='" + candidateName + '\'' +
                ", score=" + score +
                ", decision='" + decision + '\'' +
                ", remarks='" + remarks + '\'' +
                ", interviewId='" + interviewId + '\'' +
                '}';
    }
}
