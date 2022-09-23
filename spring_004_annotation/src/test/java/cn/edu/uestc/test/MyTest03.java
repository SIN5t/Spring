package cn.edu.uestc.test;

import cn.edu.uestc.s03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student stu = (Student)ac.getBean("student"); //@Component 没写东西的时候默认是其驼峰命名
        System.out.println(stu);
    }
}
