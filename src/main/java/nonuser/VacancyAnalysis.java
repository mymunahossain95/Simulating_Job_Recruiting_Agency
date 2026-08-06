package nonuser;

import java.io.Serializable;

public class VacancyAnalysis implements Serializable {
    private String jobTitle;
    private String company;
    private int daysRequired;
    private String status;

    public VacancyAnalysis(String jobTitle,
                           String company,
                           int daysRequired,
                           String status) {

        this.jobTitle = jobTitle;
        this.company = company;
        this.daysRequired = daysRequired;
        this.status = status;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public int getDaysRequired() {
        return daysRequired;
    }

    public String getStatus() {
        return status;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDaysRequired(int daysRequired) {
        this.daysRequired = daysRequired;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VacancyAnalysis{" +
                "jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", daysRequired=" + daysRequired +
                ", status='" + status + '\'' +
                '}';
    }
}
