package spcls;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorDependencyInjection {
    
    public static void main(String[] str) {
        
        Resource r = new ClassPathResource("spcls/springconfig.xml");
        BeanFactory b = new XmlBeanFactory(r);
        Customer c = (Customer)b.getBean("customer");
        c.showDetails();
    }
}
