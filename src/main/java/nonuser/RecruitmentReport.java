package nonuser;

import java.io.Serializable;

public class RecruitmentReport implements Serializable {

    private String reportId;
    private String reportType;
    private String totalRecords;
    private String generatedDate;

    public RecruitmentReport(String reportId, String reportType, String totalRecords, String generatedDate) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.totalRecords = totalRecords;
        this.generatedDate = generatedDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
    }

    @Override
    public String toString() {
        return "RecruitmentReport{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", totalRecords='" + totalRecords + '\'' +
                ", generatedDate='" + generatedDate + '\'' +
                '}';
    }
}
