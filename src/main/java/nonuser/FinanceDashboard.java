package nonuser;

import java.io.Serializable;

public class FinanceDashboard implements Serializable {
        private String dashboardId;
        private String dashboardName;
        private String lastUpdated;
        private String status;

        public FinanceDashboard(String dashboardId, String dashboardName, String lastUpdated, String status) {
            this.dashboardId = dashboardId;
            this.dashboardName = dashboardName;
            this.lastUpdated = lastUpdated;
            this.status = status;
        }

        public String getDashboardId() {
            return dashboardId;
        }

        public String getDashboardName() {
            return dashboardName;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public String getStatus() {
            return status;
        }

        public void setDashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
        }

        public void setDashboardName(String dashboardName) {
            this.dashboardName = dashboardName;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "FinanceDashboard{" +
                    "dashboardId='" + dashboardId + '\'' +
                    ", dashboardName='" + dashboardName + '\'' +
                    ", lastUpdated='" + lastUpdated + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }