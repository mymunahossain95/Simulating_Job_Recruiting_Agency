package nonuser;

import java.io.Serializable;

public class Payment implements Serializable {

        private String paymentId;
        private String candidateName;
        private double amount;
        private String paymentDate;

        public Payment(String paymentId, String candidateName, double amount, String paymentDate) {
            this.paymentId = paymentId;
            this.candidateName = candidateName;
            this.amount = amount;
            this.paymentDate = paymentDate;
        }

        public String getPaymentId() {
            return paymentId;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public double getAmount() {
            return amount;
        }

        public String getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentId(String paymentId) {
            this.paymentId = paymentId;
        }

        public void setCandidateName(String candidateName) {
            this.candidateName = candidateName;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
        }

        @Override
        public String toString() {
            return "Payment{" +
                    "paymentId='" + paymentId + '\'' +
                    ", candidateName='" + candidateName + '\'' +
                    ", amount=" + amount +
                    ", paymentDate='" + paymentDate + '\'' +
                    '}';
        }
    }

