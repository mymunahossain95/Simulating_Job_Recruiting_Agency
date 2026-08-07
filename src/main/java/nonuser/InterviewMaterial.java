package nonuser;

import java.io.Serializable;

public class InterviewMaterial implements Serializable {
    private String materialId;
    private String materialName;
    private String materialType;
    private String description;

    public InterviewMaterial(String materialId, String materialName, String materialType, String description) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.materialType = materialType;
        this.description = description;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
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
                "materialId='" + materialId + '\'' +
                ", materialName='" + materialName + '\'' +
                ", materialType='" + materialType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

