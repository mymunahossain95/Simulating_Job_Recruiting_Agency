package nonuser;

import java.io.Serializable;

public class PerformanceReport implements Serializable {

    private String assessmentName;
    private double score;
    private int attempts;
    private double averageScore;
    private String performanceLevel;

    public PerformanceReport(String assessmentName, double score, int attempts, double averageScore, String performanceLevel) {
        this.assessmentName = assessmentName;
        this.score = score;
        this.attempts = attempts;
        this.averageScore = averageScore;
        this.performanceLevel = performanceLevel;
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

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public void setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
    }

    @Override
    public String toString() {
        return "PerformanceReport{" +
                "assessmentName='" + assessmentName + '\'' +
                ", score=" + score +
                ", attempts=" + attempts +
                ", averageScore=" + averageScore +
                ", performanceLevel='" + performanceLevel + '\'' +
                '}';
    }

}
