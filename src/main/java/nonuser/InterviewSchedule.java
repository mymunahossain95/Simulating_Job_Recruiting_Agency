package nonuser;

import java.io.Serializable;

public class InterviewSchedule implements Serializable {

    private String interviewId;
    private String candidateName;
    private String interviewerName;
    private String date;
    private String time;
    private String status;

    public InterviewSchedule(String interviewId, String candidateName, String interviewerName, String date, String time, String status) {
        this.interviewId = interviewId;
        this.candidateName = candidateName;
        this.interviewerName = interviewerName;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public String getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InterviewSchedule{" +
                "interviewId='" + interviewId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", interviewerName='" + interviewerName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
