package hbcls;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class CollectionMappingDemo {
    
    public static void main(String[] str) {
        
        List<String> answers = new ArrayList();
        answers.add("Cascading Style Sheet");
        answers.add("Cascading Sheet Style");
        answers.add("Common Style Sheet");
        answers.add("Common Sheet Style");
        
        QuestionAndAnswer qa = new QuestionAndAnswer();
        qa.setQid("Q-2");
        qa.setQname("Expand CSS");
        qa.setAnswers(answers);
        
        Configuration con = new Configuration();
        con.configure("hbcls/csi.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();
        
        ses.persist(qa);
        
        t.commit();
        ses.close();
        sf.close();
    }
}
