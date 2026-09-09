package spcls;

import java.util.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterWithList {
    
    public static void main(String[] str) {
        
        Resource r = new ClassPathResource("spcls/springconfig.xml");
        BeanFactory b = new XmlBeanFactory(r);
        QuestionAndAnswer qa = (QuestionAndAnswer)b.getBean("qa");
        
        System.out.println("Question ID : " + qa.getQid());
        System.out.println("Question Name : " + qa.getQname());
        System.out.println("Options are...");
        List<String> lst = qa.getAnswer();
        Iterator<String> ite = lst.iterator();
        while(ite.hasNext()) {
            String value = ite.next();
            System.out.println(value);
        }
    }
}
