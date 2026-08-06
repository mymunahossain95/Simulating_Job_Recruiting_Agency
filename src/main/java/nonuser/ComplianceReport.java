package nonuser;

import java.io.Serializable;

public class ComplianceReport implements Serializable {

        private String complianceId;
        private String issue;
        private String recommendation;
        private String status;

        public ComplianceReport(String complianceId, String issue, String recommendation, String status) {
            this.complianceId = complianceId;
            this.issue = issue;
            this.recommendation = recommendation;
            this.status = status;
        }

        public String getComplianceId() {
            return complianceId;
        }

        public String getIssue() {
            return issue;
        }

        public String getRecommendation() {
            return recommendation;
        }

        public String getStatus() {
            return status;
        }

        public void setComplianceId(String complianceId) {
            this.complianceId = complianceId;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public void setRecommendation(String recommendation) {
            this.recommendation = recommendation;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "ComplianceReport{" +
                    "complianceId='" + complianceId + '\'' +
                    ", issue='" + issue + '\'' +
                    ", recommendation='" + recommendation + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

