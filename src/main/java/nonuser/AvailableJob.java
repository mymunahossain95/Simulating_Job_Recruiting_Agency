package nonuser;

import java.io.Serializable;

public class AvailableJob implements Serializable {
    private String jobTitle;
    private String companyName;
    private String requiredSkills;
    private String location;
    private String minimumEducation;
    private String requiredExperience;

    public AvailableJob() {
    }

    public AvailableJob(String jobTitle, String companyName, String requiredSkills, String location, String minimumEducation, String requiredExperience) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.requiredSkills = requiredSkills;
        this.location = location;
        this.minimumEducation = minimumEducation;
        this.requiredExperience = requiredExperience;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMinimumEducation() {
        return minimumEducation;
    }

    public void setMinimumEducation(String minimumEducation) {
        this.minimumEducation = minimumEducation;
    }

    public String getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(String requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    @Override
    public String toString() {
        return "AvailableJob{" +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", requiredSkills='" + requiredSkills + '\'' +
                ", location='" + location + '\'' +
                ", minimumEducation='" + minimumEducation + '\'' +
                ", requiredExperience='" + requiredExperience + '\'' +
                '}';
    }
}
