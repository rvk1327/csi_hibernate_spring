package hbcls;

import java.util.List;
import javax.persistence.*;

@Entity
public class Subject {
    
    @Id
    @Column(name="subid", length = 30)
    private String subid;
    
    @Column(name="subname", length = 100)
    private String subname;
    
    @OneToMany(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    private List<Teacher> teachers;

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
}
