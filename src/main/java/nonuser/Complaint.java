package nonuser;

import java.io.Serializable;

public class Complaint implements Serializable {

        private String complaintId;
        private String userName;
        private String description;
        private String status;

        public Complaint(String complaintId, String userName, String description, String status) {
            this.complaintId = complaintId;
            this.userName = userName;
            this.description = description;
            this.status = status;
        }

        public String getComplaintId() {
            return complaintId;
        }

        public String getUserName() {
            return userName;
        }

        public String getDescription() {
            return description;
        }

        public String getStatus() {
            return status;
        }

        public void setComplaintId(String complaintId) {
            this.complaintId = complaintId;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Complaint{" +
                    "complaintId='" + complaintId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", description='" + description + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

