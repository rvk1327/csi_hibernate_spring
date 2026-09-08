package hbcls;

import javax.persistence.*;

@Entity
//@DiscriminatorValue(value = "Contract")
public class Contract extends Employee{
    
    @Column(name="hrrate")
    private double hr_rate;
    
    @Column(name="incentive")
    private double incentive;

    public double getHr_rate() {
        return hr_rate;
    }

    public void setHr_rate(double hr_rate) {
        this.hr_rate = hr_rate;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }
    
    
}
