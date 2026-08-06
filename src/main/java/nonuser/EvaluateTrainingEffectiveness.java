package nonuser;

import java.io.Serializable;

public class EvaluateTrainingEffectiveness implements Serializable {
    private final String programName;
    private int participants;
    private double averageScore;
    private String completionRate;

    public EvaluateTrainingEffectiveness(String programName,
                                         int participants,
                                         double averageScore,
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

    public double getAverageScore() {
        return averageScore;
    }

    public String getCompletionRate() {
        return completionRate;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public void setAverageScore(double averageScore) {
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
