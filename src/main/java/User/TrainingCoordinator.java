package User;

import java.io.Serializable;
import java.time.LocalDate;

public class TrainingCoordinator extends User implements Serializable {

    private final String coordinatorId;

    public TrainingCoordinator(
            String userId,
            String coordinatorId,
            String fullName,
            String email,
            String password,
            LocalDate dateOfBirth,
            String phone,
            String address,
            String status) {

        super(
                userId,
                fullName,
                email,
                password,
                dateOfBirth,
                phone,
                address,
                status
        );

        this.coordinatorId = coordinatorId;
    }

    public String getCoordinatorId() {
        return coordinatorId;
    }

    @Override
    public String toString() {
        return "TrainingCoordinator{" +
                "coordinatorId='" + coordinatorId + '\'' +
                ", userId='" + getUserId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}