package hbcls;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToManyRelationship {
    
    public static void main(String[] str) {
        
        Customer c1 = new Customer();
        c1.setCustid("C-1");
        c1.setCust_name("ABC");
        c1.setEmailid("abc@gmail.com");
        
        Customer c2 = new Customer();
        c2.setCustid("C-2");
        c2.setCust_name("DEF");
        c2.setEmailid("def@gmail.com");
        
        Customer c3 = new Customer();
        c3.setCustid("C-3");
        c3.setCust_name("GHI");
        c3.setEmailid("ghi@gmail.com");
        
        List<Customer> customers = new ArrayList();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        
        Shop shop = new Shop();
        shop.setShop_id("S-1");
        shop.setShop_name("XYZ Departmental Store");
        shop.setShop_location("OOTY");
        shop.setCustomers(customers);
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        ses.persist(shop);
        
        t.commit();
        ses.close();
        sf.close();
                
    }
}
