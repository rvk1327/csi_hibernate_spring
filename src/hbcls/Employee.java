package hbcls;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "category")
//@DiscriminatorValue(value = "Shortlisted")
public class Employee {
    
    @Id
    @Column(name="empid",length = 30)
    private String emp_id;
    
    @Column(name="empname", length = 100)
    private String emp_name;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    
    
}
