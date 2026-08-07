package nonuser;

import java.io.Serializable;

public class EvaluateTrainingEffectiveness implements Serializable {
    private final String programName;
    private int participants;
    private String averageScore;
    private String completionRate;

    public EvaluateTrainingEffectiveness(String programName,
                                         int participants,
                                         String averageScore,
                                         String completionRate) {

        this.programName = programName;
        this.participants = participants;
        this.averageScore = averageScore;
        this.completionRate = completionRate;
    }

    public String getProgramName() {
        return programName;
    }

    public int getParticipants() {
        return participants;
    }

    public String getAverageScore() {
        return averageScore;
    }

    public String getCompletionRate() {
        return completionRate;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }

    public void setCompletionRate(String completionRate) {
        this.completionRate = completionRate;
    }

    @Override
    public String toString() {
        return "EvaluateTrainingEffectiveness{" +
                "programName='" + programName + '\'' +
                ", participants=" + participants +
                ", averageScore=" + averageScore +
                ", completionRate='" + completionRate + '\'' +
                '}';
    }
}
