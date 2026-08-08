package nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class EducationRecords implements Serializable {
    private String exam;
    private String board;
    private String group;
    private int passingYear;
    private Float gpa;
    private int certificateNo;
    private String certificateName;
    private String institute;
    private String certificateStatus;

    public EducationRecords() {
    }

    public EducationRecords(String exam, String board, String group, int passingYear, Float gpa, int certificateNo, String certificateName, String institute, String certificateStatus) {
        this.exam = exam;
        this.board = board;
        this.group = group;
        this.passingYear = passingYear;
        this.gpa = gpa;
        this.certificateNo = certificateNo;
        this.certificateName = certificateName;
        this.institute = institute;
        this.certificateStatus = certificateStatus;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public int getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(int certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    @Override
    public String toString() {
        return "EducationRecords{" +
                "exam='" + exam + '\'' +
                ", board='" + board + '\'' +
                ", group='" + group + '\'' +
                ", passingYear=" + passingYear +
                ", gpa=" + gpa +
                ", certificateNo=" + certificateNo +
                ", certificateName='" + certificateName + '\'' +
                ", institute='" + institute + '\'' +
                ", certificateStatus='" + certificateStatus + '\'' +
                '}';
    }
}
