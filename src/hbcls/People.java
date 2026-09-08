package hbcls;

import javax.persistence.*;

@Entity
@Table(name="people2")
public class People {
    
    @Id
    @Column(name="peopleid",length = 30)
    private String people_id;
    
    @Column(name="peoplename", length = 100)
    private String people_name;
    
    @Column(name="mobile",length = 25)
    private String mobile;
    
    @OneToOne(targetEntity = Google.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "emailid")
    private Google google;

    public String getPeople_id() {
        return people_id;
    }

    public void setPeople_id(String people_id) {
        this.people_id = people_id;
    }

    public String getPeople_name() {
        return people_name;
    }

    public void setPeople_name(String people_name) {
        this.people_name = people_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Google getGoogle() {
        return google;
    }

    public void setGoogle(Google google) {
        this.google = google;
    }
    
    
            
}
