package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class TrainingManagement implements Serializable {
    private final String programId;
    private String programName;
    private String category;
    private LocalDate startDate;

    public TrainingManagement(String programId,
                           String programName,
                           String category,
                           LocalDate startDate) {

        this.programId = programId;
        this.programName = programName;
        this.category = category;
        this.startDate = startDate;
    }

    public String getProgramId() {
        return programId;
    }

    public String getProgramName() {
        return programName;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "programId='" + programId + '\'' +
                ", programName='" + programName + '\'' +
                ", category='" + category + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
