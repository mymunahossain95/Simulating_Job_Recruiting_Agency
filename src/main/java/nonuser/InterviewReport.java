package nonuser;

import java.io.Serializable;

public class InterviewReport implements Serializable {

    // Fields
    private String candidateName;
    private String interviewDate;
    private String result;
    private String status;

    public InterviewReport(String candidateName, String interviewDate, String result, String status) {
        this.candidateName = candidateName;
        this.interviewDate = interviewDate;
        this.result = result;
        this.status = status;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InterviewReport{" +
                "candidateName='" + candidateName + '\'' +
                ", interviewDate='" + interviewDate + '\'' +
                ", result='" + result + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
