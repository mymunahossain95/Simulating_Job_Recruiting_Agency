package nonuser;

import java.io.Serializable;

public class FinancialReport implements Serializable {

        private String reportId;
        private String reportType;
        private String generatedDate;
        private double totalAmount;

        public FinancialReport(String reportId, String reportType, String generatedDate, double totalAmount) {
            this.reportId = reportId;
            this.reportType = reportType;
            this.generatedDate = generatedDate;
            this.totalAmount = totalAmount;
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

        public double getTotalAmount() {
            return totalAmount;
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

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        @Override
        public String toString() {
            return "FinancialReport{" +
                    "reportId='" + reportId + '\'' +
                    ", reportType='" + reportType + '\'' +
                    ", generatedDate='" + generatedDate + '\'' +
                    ", totalAmount=" + totalAmount +
                    '}';
        }
    }

