import java.time.LocalDateTime;

public class Medication {
    private String id;
    private Prescription prescription;
    private String name;
    private String dosage;
    private String frequency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Medication() {
    }

    public Medication(String id, Prescription prescription, String medicationName, String dosage, String frequency, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.prescription = prescription;
        this.name = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
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
