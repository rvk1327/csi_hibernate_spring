package spcls;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DependencyInjection {
    
    public static void main(String[] str) {
        
        Resource r = new ClassPathResource("spcls/springconfig.xml");
        BeanFactory b = new XmlBeanFactory(r);
        Book bk = (Book)b.getBean("book");
        
        System.out.println("Book ID : " + bk.getBook_id());
        System.out.println("Book Name : " + bk.getBook_name());
        System.out.println("Author : " + bk.getAuthor());
        Library lib = bk.getLibrary();
        System.out.println("Library ID : " + lib.getLib_id());
        System.out.println("Library Name : " + lib.getLib_name());
        System.out.println("Location : " + lib.getLocation());
    }
}
