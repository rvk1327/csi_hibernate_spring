package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ComponentMapping {
    
    public static void main(String[] str) {
        
        Address addr = new Address();
        addr.setCity("OOTY");
        addr.setStreet("Ketti Street");
        addr.setPincode("123456");
        
        Staff staff = new Staff();
        staff.setStaff_id("S-1");
        staff.setStaff_name("ABC");
        staff.setDepartment("CSE");
        staff.setAddress(addr);
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        ses.persist(staff);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
