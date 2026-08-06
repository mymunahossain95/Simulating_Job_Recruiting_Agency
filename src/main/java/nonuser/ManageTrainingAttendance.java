package nonuser;

import java.io.Serializable;

public class ManageTrainingAttendance implements Serializable {
    private final String candidateId;
    private String candidateName;
    private String attendance;
    private String status;

    public ManageTrainingAttendance(String candidateId,
                                    String candidateName,
                                    String attendance,
                                    String status) {

        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.attendance = attendance;
        this.status = status;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getAttendance() {
        return attendance;
    }

    public String getStatus() {
        return status;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ManageTrainingAttendance{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", attendance='" + attendance + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
