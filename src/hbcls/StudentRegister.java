package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class StudentRegister {
    
    public static void main(String[] str) {
        
        Student st = new Student();
        st.setRollno("st-1");
        st.setStname("abc");
        st.setRank(1);
        st.setMark(97.78);
        
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        ses.persist(st);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
