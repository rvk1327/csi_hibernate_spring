package hbcls;

import javax.persistence.*;

@Entity
//@DiscriminatorValue(value = "Permanent")
public class Permanent extends Employee {
    
    @Column(name="salary")
    private double salary;
    
    @Column(name="bonus")
    private double bonus;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
