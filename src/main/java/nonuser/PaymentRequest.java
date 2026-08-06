package nonuser;

import java.io.Serializable;

public class PaymentRequest implements Serializable {

        private String requestId;
        private String candidateName;
        private double amount;
        private String status;

        public PaymentRequest(String requestId, String candidateName, double amount, String status) {
            this.requestId = requestId;
            this.candidateName = candidateName;
            this.amount = amount;
            this.status = status;
        }

        public String getRequestId() {
            return requestId;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public double getAmount() {
            return amount;
        }

        public String getStatus() {
            return status;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public void setCandidateName(String candidateName) {
            this.candidateName = candidateName;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "PaymentRequest{" +
                    "requestId='" + requestId + '\'' +
                    ", candidateName='" + candidateName + '\'' +
                    ", amount=" + amount +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

