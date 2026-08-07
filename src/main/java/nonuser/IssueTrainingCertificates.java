package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class IssueTrainingCertificates implements Serializable {
    private final int certificateId;
    private final int candidateId;
    private String candidateName;
    private String trainingProgram;
    private String completionStatus;
    private LocalDate issueDate;

    public IssueTrainingCertificates(int certificateId,
                                    int candidateId,
                                    String candidateName,
                                    String trainingProgram,
                                    String completionStatus,
                                    LocalDate issueDate) {

        this.certificateId = certificateId;
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.trainingProgram = trainingProgram;
        this.completionStatus = completionStatus;
        this.issueDate = issueDate;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getTrainingProgram() {
        return trainingProgram;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public void setTrainingProgram(String trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "IssueTrainingCertificate{" +
                "certificateId='" + certificateId + '\'' +
                ", candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", trainingProgram='" + trainingProgram + '\'' +
                ", completionStatus='" + completionStatus + '\'' +
                ", issueDate=" + issueDate +
                '}';
    }
}
