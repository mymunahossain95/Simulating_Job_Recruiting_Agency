package nonuser;

import java.io.Serializable;

public class Evaluation implements Serializable {

    private String candidateName;
    private String assessmentName;
    private double score;
    private double percentage;
    private String grade;
    private String evaluationDate;
    private String status;
    private String remarks;

    public Evaluation(String candidateName, String assessmentName, double score, double percentage, String grade, String evaluationDate, String status, String remarks) {
        this.candidateName = candidateName;
        this.assessmentName = assessmentName;
        this.score = score;
        this.percentage = percentage;
        this.grade = grade;
        this.evaluationDate = evaluationDate;
        this.status = status;
        this.remarks = remarks;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(String evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "candidateName='" + candidateName + '\'' +
                ", assessmentName='" + assessmentName + '\'' +
                ", score=" + score +
                ", percentage=" + percentage +
                ", grade='" + grade + '\'' +
                ", evaluationDate='" + evaluationDate + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
