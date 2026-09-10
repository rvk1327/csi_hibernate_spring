package sphb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeContext {
    
    public static CollegeDAO getContext() {
        
        ApplicationContext ac = new ClassPathXmlApplicationContext("sphb/springconfig.xml");
        return (CollegeDAO)ac.getBean("clg_dao");
    }
}
