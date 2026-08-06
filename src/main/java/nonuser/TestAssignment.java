package nonuser;

import java.io.Serializable;

public class TestAssignment implements Serializable {

    private String assignmentId;
    private String candidateName;
    private String assessmentName;
    private String assignmentDate;
    private String status;

    public TestAssignment(String status, String assignmentDate, String assessmentName, String candidateName, String assignmentId) {
        this.status = status;
        this.assignmentDate = assignmentDate;
        this.assessmentName = assessmentName;
        this.candidateName = candidateName;
        this.assignmentId = assignmentId;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    public String getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(String assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TestAssignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", assessmentName='" + assessmentName + '\'' +
                ", assignmentDate='" + assignmentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
