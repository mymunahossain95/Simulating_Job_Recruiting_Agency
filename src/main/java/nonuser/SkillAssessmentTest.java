package nonuser;

import java.io.Serializable;

public class SkillAssessmentTest implements Serializable {


    private String testId;
    private String testTitle;
    private String skillCategory;
    private String testInstructions;
    private String creationDate;
    private String status;

    public SkillAssessmentTest(String testId, String testTitle, String skillCategory, String testInstructions, String creationDate, String status) {
        this.testId = testId;
        this.testTitle = testTitle;
        this.skillCategory = skillCategory;
        this.testInstructions = testInstructions;
        this.creationDate = creationDate;
        this.status = status;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle;
    }

    public String getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }

    public String getTestInstructions() {
        return testInstructions;
    }

    public void setTestInstructions(String testInstructions) {
        this.testInstructions = testInstructions;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SkillAssessmentTest{" +
                "testId='" + testId + '\'' +
                ", testTitle='" + testTitle + '\'' +
                ", skillCategory='" + skillCategory + '\'' +
                ", testInstructions='" + testInstructions + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
