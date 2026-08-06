package nonuser;

import java.io.Serializable;

public class RecruitmentPerformance implements Serializable {
    private String department;
    private int recruitments;
    private double averageHiringTime;
    private double successRate;

    public RecruitmentPerformance(String department,
                                  int recruitments,
                                  double averageHiringTime,
                                  double successRate) {

        this.department = department;
        this.recruitments = recruitments;
        this.averageHiringTime = averageHiringTime;
        this.successRate = successRate;
    }

    public String getDepartment() {
        return department;
    }

    public int getRecruitments() {
        return recruitments;
    }

    public double getAverageHiringTime() {
        return averageHiringTime;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRecruitments(int recruitments) {
        this.recruitments = recruitments;
    }

    public void setAverageHiringTime(double averageHiringTime) {
        this.averageHiringTime = averageHiringTime;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    @Override
    public String toString() {
        return "RecruitmentPerformance{" +
                "department='" + department + '\'' +
                ", recruitments=" + recruitments +
                ", averageHiringTime=" + averageHiringTime +
                ", successRate=" + successRate +
                '}';
    }
}

