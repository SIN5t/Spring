package cn.edu.uestc.test;

import cn.edu.uestc.controller.UsersController;
import cn.edu.uestc.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsert(){
        //肯定是去创建界面层的连接对象！
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        //取出UsersController对象，既然是取出，肯定是按照之前已经创建好的引用的名称的取！
        UsersController u = (UsersController) ac.getBean("uController");
        //界面层提供的方法用户这边要用
        //这里自己输入，不用在pojo类中去依赖注入
        u.insert(new Users("zhangsan",22,"成都市"));
    }

}
