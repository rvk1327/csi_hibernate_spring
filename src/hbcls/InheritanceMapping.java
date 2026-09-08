package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class InheritanceMapping {
    
    public static void main(String[] str) {
        
        Permanent permanent = new Permanent();
        permanent.setEmp_id("emp-1");
        permanent.setEmp_name("abc");
        permanent.setSalary(50000.00);
        permanent.setBonus(10000.00); 
        
        Contract contract = new Contract();
        contract.setEmp_id("emp-2");
        contract.setEmp_name("def");
        contract.setHr_rate(500.00);
        contract.setIncentive(1000.00); 
        
        Employee employee = new Employee();
        employee.setEmp_id("emp-3");
        employee.setEmp_name("ghi");
                
        
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
       
        ses.persist(permanent);        
        ses.persist(contract);
        ses.persist(employee);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
