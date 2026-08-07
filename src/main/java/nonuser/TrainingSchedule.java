package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class TrainingSchedule implements Serializable {

    private final String sessionId;
    private String programName;
    private String trainer;
    private LocalDate date;
    private String time;
    private String venue;

    public TrainingSchedule(String sessionId,
                            String programName,
                            String trainer,
                            LocalDate date,
                            String time,
                            String venue) {

        this.sessionId = sessionId;
        this.programName = programName;
        this.trainer = trainer;
        this.date = date;
        this.time = time;
        this.venue = venue;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getProgramName() {
        return programName;
    }

    public String getTrainer() {
        return trainer;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "TrainingSchedule{" +
                "sessionId='" + sessionId + '\'' +
                ", programName='" + programName + '\'' +
                ", trainer='" + trainer + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}