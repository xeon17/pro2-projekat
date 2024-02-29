import java.time.LocalDateTime;
import java.util.Set;

public class Condition {
    private String id;
    private User patient;
    private String name;
    private String description;
    private Set<User> patients;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Condition() {
    }

    public Condition(String id, User patient, String name, String description, Set<User> patients, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.patient = patient;
        this.name = name;
        this.description = description;
        this.patients = patients;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getPatients() {
        return patients;
    }

    public void setPatients(Set<User> patients) {
        this.patients = patients;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
