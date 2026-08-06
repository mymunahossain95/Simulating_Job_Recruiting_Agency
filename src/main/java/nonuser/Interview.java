package nonuser;

import java.io.Serializable;

public class Interview implements Serializable {

    private int interviewId;
    private String candidateId;
    private String candidateName;
    private String companyName;
    private String interviewDate;
    private String interviewTime;
    private String interviewLocation;
    private String attendanceStatus;


    public Interview(int interviewId, String candidateId, String candidateName, String companyName, String interviewDate, String interviewTime, String interviewLocation, String attendanceStatus) {
        this.interviewId = interviewId;
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.companyName = companyName;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.interviewLocation = interviewLocation;
        this.attendanceStatus = attendanceStatus;
    }

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getInterviewLocation() {
        return interviewLocation;
    }

    public void setInterviewLocation(String interviewLocation) {
        this.interviewLocation = interviewLocation;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "interviewId=" + interviewId +
                ", candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", interviewDate='" + interviewDate + '\'' +
                ", interviewTime='" + interviewTime + '\'' +
                ", interviewLocation='" + interviewLocation + '\'' +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                '}';
    }
}




