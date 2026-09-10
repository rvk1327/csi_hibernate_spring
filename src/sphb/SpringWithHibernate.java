package sphb;

import java.util.*;

public class SpringWithHibernate {
    
    public static void main(String[] str) {
        
        /*StudentData student = new StudentData();
        student.setRollno("st-4");
        student.setStname("jkl");
        student.setRank(1);
        student.setMark(98.89);*/
        
        //CollegeContext.getContext().storeData(student);
        //CollegeContext.getContext().updateData(student);
        //CollegeContext.getContext().deleteData(student);
        
        List<StudentData> lst = CollegeContext.getContext().retrieveData("from StudentData");
        Iterator<StudentData> ite = lst.iterator();
        while(ite.hasNext()) {
            
            StudentData sd = ite.next();
            
            System.out.println("Roll No : " + sd.getRollno());
            System.out.println("Name : " + sd.getStname());
            System.out.println("Rank : " + sd.getRank());
            System.out.println("Mark : " + sd.getMark());
            
            System.out.println("***********************");
        }
    }
}
