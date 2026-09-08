package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ManyToOneRelationship {
    
    public static void main(String[] str) {
        
        People p = new People();
        p.setPeople_id("P-1");
        p.setPeople_name("ABC");
        p.setMobile("123456");
        
        Google g = new Google();
        g.setEmailid("abc@gmail.com");
        g.setPassword("Hello@123");
        g.setLocation("OOTY");
        g.setPeople(p);
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        ses.persist(g);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
