package nonuser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class AssistanceRequest implements Serializable {
    private String requestId;
    private String candidateName;
    private String requestType;
    private LocalDate submissionDate;
    private String requestDetails;
    private String response;
    private String status;

    public AssistanceRequest() {
    }

    public AssistanceRequest(String requestId, String candidateName, String requestType, LocalDate submissionDate, String requestDetails, String response, String status) {
        this.requestId = requestId;
        this.candidateName = candidateName;
        this.requestType = requestType;
        this.submissionDate = submissionDate;
        this.requestDetails = requestDetails;
        this.response = response;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssistanceRequest{" +
                "requestId='" + requestId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", requestType='" + requestType + '\'' +
                ", submissionDate=" + submissionDate +
                ", requestDetails='" + requestDetails + '\'' +
                ", response='" + response + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
