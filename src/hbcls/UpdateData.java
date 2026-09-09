package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class UpdateData {
    
    public static void main(String[] str) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter Roll No : ");
        String rno = sc.nextLine();
        
        System.out.println("Enter Rank : ");
        int rank = sc.nextInt();
        
        System.out.println("Enter Mark : ");
        double mark = sc.nextDouble();
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        Query q = ses.createQuery("update Student set rank=:r, mark=:m where rollno=:rn");
        q.setInteger("r", rank);
        q.setDouble("m", mark);
        q.setString("rn", rno);
        
        q.executeUpdate();
        
        t.commit();
        ses.close();
        sf.close();
        
    }
}
