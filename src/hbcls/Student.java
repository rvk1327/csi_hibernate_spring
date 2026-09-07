package hbcls;

import javax.persistence.*;

@Entity
@Table(name="csi_student")
public class Student {
    
    @Id
    @Column(name="rno", length = 30)
    private String rollno;
    
    @Column(name="stud_name", length = 100)
    private String stname;
    
    @Column(name="strank", length = 3)
    private int rank;
    
    @Column(name="stmark")
    private double mark;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    
}
