package nonuser;

import java.io.Serializable;

public class Refund implements Serializable {
    private String refundId;
    private String paymentId;
    private double refundAmount;
    private String status;

    public Refund(String refundId, String paymentId, double refundAmount, String status) {
        this.refundId = refundId;
        this.paymentId = paymentId;
        this.refundAmount = refundAmount;
        this.status = status;
    }

    public String getRefundId() {
        return refundId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId='" + refundId + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", refundAmount=" + refundAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
