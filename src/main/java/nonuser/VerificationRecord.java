package nonuser;

import java.io.Serializable;

public class VerificationRecord implements Serializable {
    private String verificationType;
    private String status;
    private String remarks;
    private String result;

    public VerificationRecord() {
    }

    public VerificationRecord(String verificationType, String status, String remarks, String result) {
        this.verificationType = verificationType;
        this.status = status;
        this.remarks = remarks;
        this.result = result;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "VerificationRecord{" +
                "verificationType='" + verificationType + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
