package nonuser;

import java.io.Serializable;
import java.util.ArrayList;

public class Candidate implements Serializable {
    private int candidateId;
    private String candidateName;
    private String email;
    private String phoneNumber;
    private String education;
    private ArrayList<String> skills;
    private String experience;

    public Candidate(int candidateId, String candidateName, String email, String phoneNumber, String education, ArrayList<String> skills, String experience) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", education='" + education + '\'' +
                ", skills=" + skills +
                ", experience='" + experience + '\'' +
                '}';
    }
}
