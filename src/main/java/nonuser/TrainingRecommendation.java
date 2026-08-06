package nonuser;

import java.io.Serializable;

public class TrainingRecommendation implements Serializable {

    private String candidateName;
    private String weakSkillArea;
    private String recommendedTraining;
    private String priorityLevel;

    public TrainingRecommendation(String candidateName, String weakSkillArea, String recommendedTraining, String priorityLevel) {
        this.candidateName = candidateName;
        this.weakSkillArea = weakSkillArea;
        this.recommendedTraining = recommendedTraining;
        this.priorityLevel = priorityLevel;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getWeakSkillArea() {
        return weakSkillArea;
    }

    public void setWeakSkillArea(String weakSkillArea) {
        this.weakSkillArea = weakSkillArea;
    }

    public String getRecommendedTraining() {
        return recommendedTraining;
    }

    public void setRecommendedTraining(String recommendedTraining) {
        this.recommendedTraining = recommendedTraining;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "TrainingRecommendation{" +
                "candidateName='" + candidateName + '\'' +
                ", weakSkillArea='" + weakSkillArea + '\'' +
                ", recommendedTraining='" + recommendedTraining + '\'' +
                ", priorityLevel='" + priorityLevel + '\'' +
                '}';
    }
}
