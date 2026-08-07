package nonuser;

import java.io.Serializable;

public class ResumeReview implements Serializable {
    private String resumeId;
    private String candidateName;
    private String uploadDate;
    private String reviewStatus;

    public ResumeReview() {
    }

    public ResumeReview(String resumeId, String candidateName, String uploadDate, String reviewStatus) {
        this.resumeId = resumeId;
        this.candidateName = candidateName;
        this.uploadDate = uploadDate;
        this.reviewStatus = reviewStatus;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @Override
    public String toString() {
        return "ResumeReview{" +
                "resumeId='" + resumeId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", reviewStatus='" + reviewStatus + '\'' +
                '}';
    }
}
