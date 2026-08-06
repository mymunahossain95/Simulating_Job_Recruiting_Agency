package nonuser;

import java.io.Serializable;

public class RegistrationRequest implements Serializable {


        private String requestId;
        private String applicantName;
        private String email;
        private String status;

        public RegistrationRequest(String requestId, String applicantName, String email, String role, String status) {
            this.requestId = requestId;
            this.applicantName = applicantName;
            this.email = email;
            this.status = status;
        }

        public String getRequestId() {
            return requestId;
        }

        public String getApplicantName() {
            return applicantName;
        }

        public String getEmail() {
            return email;
        }

        public String getStatus() {
            return status;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public void setApplicantName(String applicantName) {
            this.applicantName = applicantName;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "RegistrationRequest{" +
                    "requestId='" + requestId + '\'' +
                    ", applicantName='" + applicantName + '\'' +
                    ", email='" + email + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

