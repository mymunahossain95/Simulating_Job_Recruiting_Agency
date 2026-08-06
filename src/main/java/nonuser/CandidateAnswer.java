package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class CandidateAnswer implements Serializable {

    private String submissionId;
    private String candidateName;
    private String assessmentName;
    private String answersText;
    private LocalDate submissionDate;

    public CandidateAnswer(String submissionId, String candidateName, String assessmentName, String answersText, LocalDate submissionDate) {
        this.submissionId = submissionId;
        this.candidateName = candidateName;
        this.assessmentName = assessmentName;
        this.answersText = answersText;
        this.submissionDate = submissionDate;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
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

    public String getAnswersText() {
        return answersText;
    }

    public void setAnswersText(String answersText) {
        this.answersText = answersText;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "CandidateAnswer{" +
                "submissionId='" + submissionId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", assessmentName='" + assessmentName + '\'' +
                ", answersText='" + answersText + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

}
