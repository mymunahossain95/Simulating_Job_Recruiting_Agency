package nonuser;

import java.time.LocalDate;

public class CouselingSession {
    private int requestId;
    private Candidate candidate;
    private String requestType,requestDetails,response, status;
    private LocalDate submissionDate;


    public CouselingSession(int requestId, Candidate candidate, String requestType, String requestDetails, LocalDate submissionDate, String response, String status) {
        this.requestId = requestId;
        this.candidate = candidate;
        this.requestType = requestType;
        this.requestDetails = requestDetails;
        this.submissionDate = submissionDate;
        this.response = response;
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
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
        return "CouselingSession{" +
                "requestId=" + requestId +
                ", candidate=" + candidate +
                ", requestType='" + requestType + '\'' +
                ", requestDetails='" + requestDetails + '\'' +
                ", submissionDate=" + submissionDate +
                ", response='" + response + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
