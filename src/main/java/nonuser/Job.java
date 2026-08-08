package nonuser;

import java.io.Serializable;

public class Job implements Serializable {

    private String jobId;
    private String jobTitle;
    private String companyName;
    private String jobCategory;
    private String location;
    private String salary;
    private String applicationDeadline;
    private String jobDescription;
    private String jobStatus;

    public Job(String jobId, String jobTitle, String companyName,
               String jobCategory, String location,
               String salary, String applicationDeadline,
               String jobDescription, String jobStatus) {

        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.jobCategory = jobCategory;
        this.location = location;
        this.salary = salary;
        this.applicationDeadline = applicationDeadline;
        this.jobDescription = jobDescription;
        this.jobStatus = jobStatus;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
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

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(String applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId='" + jobId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", location='" + location + '\'' +
                ", salary='" + salary + '\'' +
                ", applicationDeadline='" + applicationDeadline + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobStatus='" + jobStatus + '\'' +
                '}';
    }
}