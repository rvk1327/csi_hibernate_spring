package hbcls;

import javax.persistence.*;

@Entity
public class Customer {
    
    @Id
    @Column(name="customer_id",length = 30)
    private String custid;
    
    @Column(name="customer_name",length = 200)
    private String cust_name;
    
    @Column(name="emailid", length = 150)
    private String emailid;

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    
    
}
