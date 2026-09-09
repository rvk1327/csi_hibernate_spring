package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class DeleteData {
    
    public static void main(String[] str) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter Roll No : ");
        String rno = sc.nextLine();
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        Query q = ses.createQuery("delete from Student where rollno=:r");
        q.setString("r", rno);
        q.executeUpdate();
        
        t.commit();
        ses.close();
        sf.close();
    }
}
