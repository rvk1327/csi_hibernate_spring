package hbcls;

import javax.persistence.*;

@Entity
public class Patient {
    
    @Id
    @Column(name="pid",length = 30)
    private String patient_id;
    
    @Column(name="pname",length = 100)
    private String patient_name;
    
    @Column(name="emailid", length = 150)
    private String emailid;
    
    @OneToOne(targetEntity = Medical.class, cascade = CascadeType.ALL)
    private Medical medical;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    
    
}
