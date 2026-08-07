package nonuser;

import java.io.Serializable;
import java.util.ArrayList;

public class Candidate implements Serializable {
    private String candidateId;
    private String candidateName;
    private String education;
    private String skills;
    private String experience,email,phone;
    private String appliedJob,verificationStatus,jobRole;
    private int age;

    public Candidate() {
    }

    public Candidate(String candidateId, String candidateName, String education, String skills, String experience, String email, String phone, String appliedJob, String verificationStatus, String jobRole, int age) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
        this.email = email;
        this.phone = phone;
        this.appliedJob = appliedJob;
        this.verificationStatus = verificationStatus;
        this.jobRole = jobRole;
        this.age = age;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAppliedJob() {
        return appliedJob;
    }

    public void setAppliedJob(String appliedJob) {
        this.appliedJob = appliedJob;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", education='" + education + '\'' +
                ", skills='" + skills + '\'' +
                ", experience='" + experience + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", appliedJob='" + appliedJob + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", age=" + age +
                '}';
    }
}
