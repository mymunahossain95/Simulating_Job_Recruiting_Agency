package nonuser;

import java.io.Serializable;

public class InterviewPanel implements Serializable {

    private String interviewId;
    private String panelMembers;
    private String status;

    public InterviewPanel(String interviewId, String panelMembers, String status) {
        this.interviewId = interviewId;
        this.panelMembers = panelMembers;
        this.status = status;
    }

    public String getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public String getPanelMembers() {
        return panelMembers;
    }

    public void setPanelMembers(String panelMembers) {
        this.panelMembers = panelMembers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InterviewPanel{" +
                "interviewId='" + interviewId + '\'' +
                ", panelMembers='" + panelMembers + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
