package nonuser;

import java.io.Serializable;

public class RecruitmentForecast implements Serializable {
    private int year;
    private int expectedVacancies;
    private double growthRate;
    private String recommendation;

    public RecruitmentForecast(int year,
                               int expectedVacancies,
                               double growthRate,
                               String recommendation) {

        this.year = year;
        this.expectedVacancies = expectedVacancies;
        this.growthRate = growthRate;
        this.recommendation = recommendation;
    }

    public int getYear() {
        return year;
    }

    public int getExpectedVacancies() {
        return expectedVacancies;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setExpectedVacancies(int expectedVacancies) {
        this.expectedVacancies = expectedVacancies;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return "RecruitmentForecast{" +
                "year=" + year +
                ", expectedVacancies=" + expectedVacancies +
                ", growthRate=" + growthRate +
                ", recommendation='" + recommendation + '\'' +
                '}';
    }
}
