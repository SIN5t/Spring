package cn.edu.uestc.test;

import cn.edu.uestc.pojo03.School;
import cn.edu.uestc.pojo03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void testSchool(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }

    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student = (Student)ac.getBean("stu");
        System.out.println(student);

    }
}
