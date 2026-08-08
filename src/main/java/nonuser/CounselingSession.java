package nonuser;

import java.time.LocalDate;
import java.time.LocalTime;

public class CounselingSession {
    private String sessionId;
    private String candidateName;
    private LocalDate sessionDate;
    private LocalTime sessionTime;
    private String status;
    private String previousGuidance;

    public CounselingSession(String sessionId, String candidateName, LocalDate sessionDate, LocalTime sessionTime, String status, String previousGuidance) {
        this.sessionId = sessionId;
        this.candidateName = candidateName;
        this.sessionDate = sessionDate;
        this.sessionTime = sessionTime;
        this.status = status;
        this.previousGuidance = previousGuidance;


    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public LocalTime getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(LocalTime sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPreviousGuidance() {
        return previousGuidance;
    }

    public void setPreviousGuidance(String previousGuidance) {
        this.previousGuidance = previousGuidance;
    }

    @Override
    public String toString() {
        return "CouselingSession{" +
                "sessionId='" + sessionId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", sessionDate=" + sessionDate +
                ", sessionTime=" + sessionTime +
                ", status='" + status + '\'' +
                ", previousGuidance='" + previousGuidance + '\'' +
                '}';
    }
}
