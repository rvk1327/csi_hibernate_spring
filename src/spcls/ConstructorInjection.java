package spcls;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjection {
    
    public static void main(String[] str) {
        
        Resource r = new ClassPathResource("spcls/springconfig.xml");
        BeanFactory b = new XmlBeanFactory(r);
        Product p = (Product)b.getBean("product");
        p.displayProduct();
    }
}
