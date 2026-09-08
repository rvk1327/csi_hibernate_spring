package hbcls;

import javax.persistence.*;

@Embeddable
public class Address {
    
    @Column(name="street", length = 100)
    private String street;
    
    @Column(name="city", length = 100)
    private String city;
    
    @Column(name="pincode", length = 20)
    private String pincode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
    
}
