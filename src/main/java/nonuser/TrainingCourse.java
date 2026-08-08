package nonuser;

import java.io.Serializable;

public class TrainingCourse implements Serializable {
    private int courseId;
    private String courseName,trainingProvider,duration,skillArea;

    public TrainingCourse(int courseId, String courseName, String trainingProvider, String duration, String skillArea) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainingProvider = trainingProvider;
        this.duration = duration;
        this.skillArea = skillArea;
    }

    public TrainingCourse() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainingProvider() {
        return trainingProvider;
    }

    public void setTrainingProvider(String trainingProvider) {
        this.trainingProvider = trainingProvider;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSkillArea() {
        return skillArea;
    }

    public void setSkillArea(String skillArea) {
        this.skillArea = skillArea;
    }

    @Override
    public String toString() {
        return "TrainingCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", trainingProvider='" + trainingProvider + '\'' +
                ", duration='" + duration + '\'' +
                ", skillArea='" + skillArea + '\'' +
                '}';
    }
}
