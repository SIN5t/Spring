package cn.edu.uestc.test;

import cn.edu.uestc.controller.UserController;
import cn.edu.uestc.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsertUsers(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //肯定是去找界面层的对象
        UserController uController = (UserController) ac.getBean("uController");
        int num = uController.insert(new Users(3456,"zhagnsan",22));
        System.out.println(num);
    }
}
