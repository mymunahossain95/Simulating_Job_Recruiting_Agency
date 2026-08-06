package nonuser;

import java.io.Serializable;

public class Transaction implements Serializable {

        private String transactionId;
        private String candidateName;
        private double amount;
        private String status;

        public Transaction(String transactionId, String candidateName, double amount, String status) {
            this.transactionId = transactionId;
            this.candidateName = candidateName;
            this.amount = amount;
            this.status = status;
        }

        public String getTransactionId() {
            return transactionId;
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

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
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
            return "Transaction{" +
                    "transactionId='" + transactionId + '\'' +
                    ", candidateName='" + candidateName + '\'' +
                    ", amount=" + amount +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

