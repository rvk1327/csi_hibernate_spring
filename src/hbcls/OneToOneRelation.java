package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;        

public class OneToOneRelation {
    
    public static void main(String[] str) {
        
        Library lib = new Library();
        lib.setLib_id("LIB-1");
        lib.setLib_name("Way Darkness to Light");
        
        Book book = new Book();
        book.setBook_id("B-1");
        book.setBook_name("The complete reference of java");
        book.setLib(lib);
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        ses.persist(book);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
