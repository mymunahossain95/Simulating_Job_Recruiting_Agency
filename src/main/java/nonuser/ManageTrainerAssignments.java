package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class ManageTrainerAssignments implements Serializable {

    private final String trainerId;
    private String trainerName;
    private String trainingProgram;
    private LocalDate assignmentDate;
    private String status;

    public ManageTrainerAssignments(String trainerId,
                                   String trainerName,
                                   String trainingProgram,
                                   LocalDate assignmentDate,
                                   String status) {

        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.trainingProgram = trainingProgram;
        this.assignmentDate = assignmentDate;
        this.status = status;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public String getTrainingProgram() {
        return trainingProgram;
    }

    public LocalDate getAssignmentDate() {
        return assignmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setTrainingProgram(String trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public void setAssignmentDate(LocalDate assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ManageTrainerAssignment{" +
                "trainerId='" + trainerId + '\'' +
                ", trainerName='" + trainerName + '\'' +
                ", trainingProgram='" + trainingProgram + '\'' +
                ", assignmentDate=" + assignmentDate +
                ", status='" + status + '\'' +
                '}';
    }
}
