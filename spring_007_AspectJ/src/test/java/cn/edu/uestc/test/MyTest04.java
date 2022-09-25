package cn.edu.uestc.test;

import cn.edu.uestc.s04.SomeServices;
import cn.edu.uestc.s04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void testS04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        SomeServices services = (SomeServices) ac.getBean("someServicesImpl");

        Student stu = services.changeRetVal(new Student("郑元一", 21));
        System.out.println("测试方法中的返回值" + stu);

    }
}
