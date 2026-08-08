package nonuser;

import java.io.Serializable;

public class CandidateTracking implements Serializable {
    private String candidateId;
    private String candidateName;
    private String applicationStatus;
    private String interviewStatus;
    private String placementStatus;

    public CandidateTracking() {
    }

    public CandidateTracking(String candidateId, String candidateName, String applicationStatus, String interviewStatus, String placementStatus) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.applicationStatus = applicationStatus;
        this.interviewStatus = interviewStatus;
        this.placementStatus = placementStatus;
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

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(String interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public String getPlacementStatus() {
        return placementStatus;
    }

    public void setPlacementStatus(String placementStatus) {
        this.placementStatus = placementStatus;
    }

    @Override
    public String toString() {
        return "CandidateTracking{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", applicationStatus='" + applicationStatus + '\'' +
                ", interviewStatus='" + interviewStatus + '\'' +
                ", placementStatus='" + placementStatus + '\'' +
                '}';
    }
}
