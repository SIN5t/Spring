package cn.edu.uestc.test;

import cn.edu.uestc.s01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testStudent(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //
        Student stu = (Student)ac.getBean("stu");
        System.out.println(stu);

    }
}
