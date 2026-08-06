package nonuser;

import java.io.Serializable;

public class MonitorTrainingProgress implements Serializable {
    private final String candidateName;
    private String attendance;
    private String progress;
    private String status;

    public MonitorTrainingProgress(String candidateName,
                                   String attendance,
                                   String progress,
                                   String status) {

        this.candidateName = candidateName;
        this.attendance = attendance;
        this.progress = progress;
        this.status = status;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getAttendance() {
        return attendance;
    }

    public String getProgress() {
        return progress;
    }

    public String getStatus() {
        return status;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MonitorTrainingProgress{" +
                "candidateName='" + candidateName + '\'' +
                ", attendance='" + attendance + '\'' +
                ", progress='" + progress + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
