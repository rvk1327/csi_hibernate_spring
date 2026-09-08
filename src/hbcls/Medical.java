package hbcls;

import javax.persistence.*;

@Entity
public class Medical {
    
    @Id
    @Column(name="mid", length = 30)
    private String medical_id;
    
    @Column(name="medicine",length = 255)
    private String medicine;
    
    @Column(name="duration", length = 3)
    private int duration;
    
    @OneToOne(targetEntity = Patient.class, cascade = CascadeType.ALL)
    private Patient patient;

    public String getMedical_id() {
        return medical_id;
    }

    public void setMedical_id(String medical_id) {
        this.medical_id = medical_id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
}
