package cn.edu.uestc.test;

import cn.edu.uestc.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testStudent(){
        //程序员自己写
        Student stu = new Student();//new 的时候自动调用无参构造！
    }
    @Test
    public void testStudentSpring(){
        //spring容器进行操作
        //如果想从spring容器中取出对象,则要先创建容器对象,并启动(启动的同时创建beam对象)才可以取对象.
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //getBean就是取对象，beam就是对象
        Student student =  (Student) ac.getBean("stu");
        System.out.println(student);

    }
}
