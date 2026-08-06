package nonuser;

import java.io.Serializable;

public class PaymentVerification implements Serializable {

        private String verificationId;
        private String paymentId;
        private String remarks;
        private String status;

        public PaymentVerification(String verificationId, String paymentId, String remarks, String status) {
            this.verificationId = verificationId;
            this.paymentId = paymentId;
            this.remarks = remarks;
            this.status = status;
        }

        public String getVerificationId() {
            return verificationId;
        }

        public String getPaymentId() {
            return paymentId;
        }

        public String getRemarks() {
            return remarks;
        }

        public String getStatus() {
            return status;
        }

        public void setVerificationId(String verificationId) {
            this.verificationId = verificationId;
        }

        public void setPaymentId(String paymentId) {
            this.paymentId = paymentId;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "PaymentVerification{" +
                    "verificationId='" + verificationId + '\'' +
                    ", paymentId='" + paymentId + '\'' +
                    ", remarks='" + remarks + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

