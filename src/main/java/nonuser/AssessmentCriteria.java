package nonuser;

import java.io.Serializable;

public class AssessmentCriteria implements Serializable {

    private String skillCategory;
    private double weightage;
    private String updatedDate;

    public AssessmentCriteria(String skillCategory, double weightage, String updatedDate) {
        this.skillCategory = skillCategory;
        this.weightage = weightage;
        this.updatedDate = updatedDate;
    }

    public String getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }

    public double getWeightage() {
        return weightage;
    }

    public void setWeightage(double weightage) {
        this.weightage = weightage;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "AssessmentCriteria{" +
                "skillCategory='" + skillCategory + '\'' +
                ", weightage=" + weightage +
                ", updatedDate='" + updatedDate + '\'' +
                '}';
    }
}
