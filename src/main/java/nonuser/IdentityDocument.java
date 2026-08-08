package nonuser;

import java.io.Serializable;

public class IdentityDocument implements Serializable {
    private String documentType;
    private int documentNumber;
    private String candidateName;
    private String issueAuthority;
    private String verificationStatus;

    public IdentityDocument() {
    }

    public IdentityDocument(String documentType, int documentNumber, String candidateName, String issueAuthority, String verificationStatus) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.candidateName = candidateName;
        this.issueAuthority = issueAuthority;
        this.verificationStatus = verificationStatus;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public void setIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    @Override
    public String toString() {
        return "IdentityDocument{" +
                "documentType='" + documentType + '\'' +
                ", documentNumber=" + documentNumber +
                ", candidateName='" + candidateName + '\'' +
                ", issueAuthority='" + issueAuthority + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                '}';
    }
}
