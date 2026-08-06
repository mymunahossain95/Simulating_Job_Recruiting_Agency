package nonuser;

import java.io.Serializable;

public class Document implements Serializable {
    private int documentId;
    private Candidate candidate;
    private String documentType,documentNumber,issueAuthority,status,remarks;


    public Document(int documentId, Candidate candidate, String documentType, String documentNumber, String issueAuthority, String status, String remarks) {
        this.documentId = documentId;
        this.candidate = candidate;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.issueAuthority = issueAuthority;
        this.status = status;
        this.remarks = remarks;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public void setIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
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

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", candidate=" + candidate +
                ", documentType='" + documentType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", issueAuthority='" + issueAuthority + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
