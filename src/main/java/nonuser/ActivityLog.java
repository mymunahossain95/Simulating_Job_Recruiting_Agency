package nonuser;

import java.io.Serializable;

public class ActivityLog implements Serializable{

        private String logId;
        private String userId;
        private String activity;
        private String date;
        private String status;

        public ActivityLog(String logId, String userId, String activity, String date, String status) {
            this.logId = logId;
            this.userId = userId;
            this.activity = activity;
            this.date = date;
            this.status = status;
        }

        public String getLogId() {
            return logId;
        }

        public String getUserId() {
            return userId;
        }

        public String getActivity() {
            return activity;
        }

        public String getDate() {
            return date;
        }

        public String getStatus() {
            return status;
        }

        public void setLogId(String logId) {
            this.logId = logId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setActivity(String activity) {
            this.activity = activity;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "ActivityLog{" +
                    "logId='" + logId + '\'' +
                    ", userId='" + userId + '\'' +
                    ", activity='" + activity + '\'' +
                    ", date='" + date + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

