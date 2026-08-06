package nonuser;

import java.io.Serializable;

public class InterviewMaterial implements Serializable {
    private int materialId;
    private String title,materialType,description;


    public InterviewMaterial(int materialId, String title, String materialType, String description) {
        this.materialId = materialId;
        this.title = title;
        this.materialType = materialType;
        this.description = description;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InterviewMaterial{" +
                "materialId=" + materialId +
                ", title='" + title + '\'' +
                ", materialType='" + materialType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
