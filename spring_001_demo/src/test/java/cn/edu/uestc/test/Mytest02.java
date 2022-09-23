package cn.edu.uestc.test;

import cn.edu.uestc.pojo02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest02 {
    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        Student student = (Student)ac.getBean("student");
        System.out.println(student);
    }
}
