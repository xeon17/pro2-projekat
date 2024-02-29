import java.time.LocalDateTime;
import java.util.Set;

public class Prescription {
    private String id;
    private User doctor;
    private User patient;
    private Appointment appointment;
    private LocalDateTime date;
    private String notes;
    private Set<Medication> medications;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Prescription() {
    }

    public Prescription(String id, User doctor, User patient, Appointment appointment, LocalDateTime date, String notes, Set<Medication> medications, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.appointment = appointment;
        this.date = date;
        this.notes = notes;
        this.medications = medications;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Medication> getMedications() {
        return medications;
    }

    public void setMedications(Set<Medication> medications) {
        this.medications = medications;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
