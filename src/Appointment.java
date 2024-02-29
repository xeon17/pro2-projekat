import java.time.LocalDateTime;
import java.util.Set;

public class Appointment {
    private String id;
    private User patient;
    private User doctor;
    private LocalDateTime date;
    private String startTime;
    private String endTime;
    private String location;
    private String description;
    private String conclusion;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Set<Prescription> prescriptions;


    public Appointment() {
    }

    public Appointment(String id, User patient, User doctor, LocalDateTime date, String startTime, String endTime, String location, String description, String conclusion, String status, LocalDateTime createdAt, LocalDateTime updatedAt, Set<Prescription> prescriptions) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.description = description;
        this.conclusion = conclusion;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.prescriptions = prescriptions;
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

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(Set<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
}
