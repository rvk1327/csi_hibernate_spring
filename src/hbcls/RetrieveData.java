package hbcls;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class RetrieveData {
    
    public static void main(String[] str) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter Roll No : ");
        String rollno = sc.nextLine();
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        Query q = ses.createQuery("from Student where rollno=:r");
        q.setString("r", rollno);
        List<Student> lst = q.list();
        
        Iterator<Student> ite = lst.iterator();
        if(ite.hasNext()) {
            Student st = ite.next();           
            
            String rno = st.getRollno();
            String stname = st.getStname();
            int strank = st.getRank();
            double stmark = st.getMark();
                
                System.out.println("Roll No : " + rno);
                System.out.println("Name : " + stname);
                System.out.println("Rank : " + strank);
                System.out.println("Mark : " + stmark);
            
                System.out.println("**********************");
            }
            
            
        
        
        t.commit();
        ses.close();
        sf.close();
    }
}
