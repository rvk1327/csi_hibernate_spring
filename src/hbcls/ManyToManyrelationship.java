package hbcls;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class ManyToManyrelationship {
    
    public static void main(String[] str) {
        
        Subject sub1 = new Subject();
        sub1.setSubid("S-1");
        sub1.setSubname("DSA");
        
        Subject sub2 = new Subject();
        sub2.setSubid("S-2");
        sub2.setSubname("Java");
        
        Subject sub3 = new Subject();
        sub3.setSubid("S-3");
        sub3.setSubname("React JS");
        
        List<Subject> lst = new ArrayList();
        lst.add(sub1);
        lst.add(sub2);
        lst.add(sub3);
        
        Teacher teacher = new Teacher();
        teacher.setTid("T-1");
        teacher.setTname("ABC");
        teacher.setSubjects(lst);
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        ses.persist(teacher);
        
        t.commit();
        ses.close();
        sf.close();
                
        
        
    }
}
