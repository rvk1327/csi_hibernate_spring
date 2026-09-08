package hbcls;

import javax.persistence.*;

@Entity
@Table(name="google2")
public class Google {
    
    @Id
    @Column(name="emailid", length = 150)
    private String emailid;
    
    @Column(name="password", length = 50)
    private String password;
    
    @Column(name="location",length = 100)
    private String location;
    
    @ManyToOne(targetEntity = People.class, cascade = CascadeType.ALL)
    @JoinColumn(name="peopleid")
    private People people;

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    
    
}
