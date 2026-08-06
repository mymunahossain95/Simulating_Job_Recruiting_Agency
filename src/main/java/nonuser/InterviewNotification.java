package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class InterviewNotification implements Serializable {

    private String notificationId;
    private String candidateId;
    private String candidateName;
    private String message;
    private LocalDate scheduledDate;
    private String status;


    public InterviewNotification(String notificationId, String candidateId, String candidateName, String message, LocalDate scheduledDate, String status) {
        this.notificationId = notificationId;
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.message = message;
        this.scheduledDate = scheduledDate;
        this.status = status;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InterviewNotification{" +
                "notificationId='" + notificationId + '\'' +
                ", candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", message='" + message + '\'' +
                ", scheduledDate=" + scheduledDate +
                ", status='" + status + '\'' +
                '}';
    }
}
