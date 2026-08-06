package nonuser;

import java.io.Serializable;

public class SystemReport implements Serializable{

        private String reportId;
        private String reportType;
        private String generatedDate;
        private String status;

        public SystemReport(String reportId, String reportType, String generatedDate, String status) {
            this.reportId = reportId;
            this.reportType = reportType;
            this.generatedDate = generatedDate;
            this.status = status;
        }

        public String getReportId() {
            return reportId;
        }

        public String getReportType() {
            return reportType;
        }

        public String getGeneratedDate() {
            return generatedDate;
        }

        public String getStatus() {
            return status;
        }

        public void setReportId(String reportId) {
            this.reportId = reportId;
        }

        public void setReportType(String reportType) {
            this.reportType = reportType;
        }

        public void setGeneratedDate(String generatedDate) {
            this.generatedDate = generatedDate;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "SystemReport{" +
                    "reportId='" + reportId + '\'' +
                    ", reportType='" + reportType + '\'' +
                    ", generatedDate='" + generatedDate + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

