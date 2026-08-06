package nonuser;

import java.io.Serializable;

public class SkillDemand implements Serializable {
    private String skillName;
    private String industry;
    private double demandPercentage;
    private double growthRate;

    public SkillDemand(String skillName,
                       String industry,
                       double demandPercentage,
                       double growthRate) {

        this.skillName = skillName;
        this.industry = industry;
        this.demandPercentage = demandPercentage;
        this.growthRate = growthRate;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getIndustry() {
        return industry;
    }

    public double getDemandPercentage() {
        return demandPercentage;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setDemandPercentage(double demandPercentage) {
        this.demandPercentage = demandPercentage;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    @Override
    public String toString() {
        return "SkillDemand{" +
                "skillName='" + skillName + '\'' +
                ", industry='" + industry + '\'' +
                ", demandPercentage=" + demandPercentage +
                ", growthRate=" + growthRate +
                '}';
    }
}
