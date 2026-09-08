package hbcls;

import java.util.List;
import javax.persistence.*;

@Entity
public class Teacher {
    
    @Id
    @Column(name="tid", length = 30)
    private String tid;
    
    @Column(name="tname", length = 100)
    private String tname;
    
    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Subject.class)
    @JoinTable(name = "subject_teacher_tble",
    joinColumns = {@JoinColumn(name="tid")},
    inverseJoinColumns = {@JoinColumn(name="subid")}    
    )
    private List<Subject> subjects;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    
    
}
