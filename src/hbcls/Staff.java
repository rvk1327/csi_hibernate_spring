package hbcls;

import javax.persistence.*;

@Entity
public class Staff {
    
    @Id
    @Column(name="staffid", length = 30)
    private String staff_id;
    
    @Column(name="staffname",length = 100)
    private String staff_name;
    
    @Column(name="department", length = 100)
    private String department;
    
    @Embedded
    private Address address;

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
