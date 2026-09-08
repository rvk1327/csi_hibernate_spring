package hbcls;

import java.util.List;

import javax.persistence.*;

@Entity
public class Shop {
    
    @Id
    @Column(name="shopid",length = 30)
    private String shop_id;
    
    @Column(name="shopname",length = 100)
    private String shop_name;
    
    @Column(name="location",length = 100)
    private String shop_location;
    
    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
    private List<Customer> customers;

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_location() {
        return shop_location;
    }

    public void setShop_location(String shop_location) {
        this.shop_location = shop_location;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
    
}
