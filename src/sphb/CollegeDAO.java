package sphb;

import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class CollegeDAO {
    
    private HibernateTemplate ht_template;

    public void setHt_template(HibernateTemplate ht_template) {
        this.ht_template = ht_template;
    }
    
    //Database Table DML Commands
    
    @Transactional(readOnly=false)
    public void storeData(Object obj) {
        ht_template.save(obj);
    }
    
    @Transactional(readOnly=false)
    public void updateData(Object obj) {
        ht_template.update(obj);
    }
    
    @Transactional(readOnly=false)
    public void deleteData(Object obj) {
        ht_template.delete(obj);
    }
    
    @Transactional(readOnly=false)
    public List retrieveData(String query) {
        
        SessionFactory sf = ht_template.getSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        Query q = ses.createQuery(query);
        return q.list();
    }
}
