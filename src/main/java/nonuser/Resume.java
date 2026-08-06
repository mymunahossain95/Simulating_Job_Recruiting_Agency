package nonuser;

import java.io.Serializable;

public class Resume implements Serializable {

    private String fullName;
    private String email;
    private String careerObjective;
    private String educationDetails;
    private String skills;
    private String workExperience;
    private String preferredJob;
    private String expectedSalary;

    public Resume(String fullName, String email, String careerObjective,
                  String educationDetails, String skills,
                  String workExperience, String preferredJob,
                  String expectedSalary) {

        this.fullName = fullName;
        this.email = email;
        this.careerObjective = careerObjective;
        this.educationDetails = educationDetails;
        this.skills = skills;
        this.workExperience = workExperience;
        this.preferredJob = preferredJob;
        this.expectedSalary = expectedSalary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCareerObjective() {
        return careerObjective;
    }

    public void setCareerObjective(String careerObjective) {
        this.careerObjective = careerObjective;
    }

    public String getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(String educationDetails) {
        this.educationDetails = educationDetails;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getPreferredJob() {
        return preferredJob;
    }

    public void setPreferredJob(String preferredJob) {
        this.preferredJob = preferredJob;
    }

    public String getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(String expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", careerObjective='" + careerObjective + '\'' +
                ", educationDetails='" + educationDetails + '\'' +
                ", skills='" + skills + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", preferredJob='" + preferredJob + '\'' +
                ", expectedSalary='" + expectedSalary + '\'' +
                '}';
    }
}
