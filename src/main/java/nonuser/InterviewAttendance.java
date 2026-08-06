package nonuser;

import java.io.Serializable;

public class InterviewAttendance implements Serializable {

    private String candidateName;
    private String interviewId;
    private String attendanceStatus;

    public InterviewAttendance(String candidateName, String interviewId, String attendanceStatus) {
        this.candidateName = candidateName;
        this.interviewId = interviewId;
        this.attendanceStatus = attendanceStatus;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return "InterviewAttendance{" +
                "candidateName='" + candidateName + '\'' +
                ", interviewId='" + interviewId + '\'' +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                '}';
    }
}
