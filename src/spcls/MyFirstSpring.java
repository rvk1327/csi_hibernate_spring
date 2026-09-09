package spcls;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyFirstSpring {
    
    public static void main(String[] str) {
        
        /*Resource r = new ClassPathResource("spcls/springconfig.xml");
        BeanFactory b = new XmlBeanFactory(r); */
        ApplicationContext ac = new ClassPathXmlApplicationContext("spcls/springconfig.xml");
        Library lib = (Library)ac.getBean("lib");
        //lib.setLocation("B-Block");
        
        System.out.println("Library ID : " + lib.getLib_id());
        System.out.println("Library Name : " + lib.getLib_name());
        System.out.println("Location : " + lib.getLocation());
    }
}
