package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToOneRelationship {
    
    public static void main(String[] str) {
        
       
        
        Patient p = new Patient();
        p.setPatient_id("P-2");
        p.setPatient_name("DEF");
        p.setEmailid("def@gmail.com");
        
        Medical m = new Medical();
        m.setMedical_id("M-2");
        m.setMedicine("Paracetamol");
        m.setDuration(2);
        m.setPatient(p);
        
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        ses.persist(m);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
