package nonuser;

import java.io.Serializable;
import java.util.ArrayList;

public class AssistanceRequest implements Serializable {
    private int candidateId;
    private String name,email,phoneNumber,education,experience;
    private int age;
    private ArrayList<String> skills;

    public AssistanceRequest(int candidateId, String name, String email, String phoneNumber, int age, String education, ArrayList<String> skills, String experience) {
        this.candidateId = candidateId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "AssistanceRequest{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", skills=" + skills +
                ", experience='" + experience + '\'' +
                '}';
    }
}
