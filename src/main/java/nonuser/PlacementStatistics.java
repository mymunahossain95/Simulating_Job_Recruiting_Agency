package nonuser;

import java.io.Serializable;

public class PlacementStatistics implements Serializable {

    private String candidateName;
    private String company;
    private String industry;
    private String status;

    public PlacementStatistics(String candidateName,
                               String company,
                               String industry,
                               String status) {

        this.candidateName = candidateName;
        this.company = company;
        this.industry = industry;
        this.status = status;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getCompany() {
        return company;
    }

    public String getIndustry() {
        return industry;
    }

    public String getStatus() {
        return status;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PlacementStatistics{" +
                "candidateName='" + candidateName + '\'' +
                ", company='" + company + '\'' +
                ", industry='" + industry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
