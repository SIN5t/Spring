package cn.edu.uestc.test;

import cn.edu.uestc.pojo.Account;
import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.AccountsService;
import cn.edu.uestc.service.UsersService;
import cn.edu.uestc.service.impl.UsersServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testUsers(){
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        //UsersService service = new UsersServiceImpl(); 怎么会拿来new呢？！！之前注解都已经创建好对象了！
        UsersService service = (UsersService) ac.getBean("usersServiceImpl");

        int num = service.insert(new Users(100309,"Yichen_Wu","123456"));
        System.out.println(num);
    }
    @Test
    public void testAccount(){
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        AccountsService service = (AccountsService) ac.getBean("accountServiceImpl");
        int num = service.add(new Account(100309, "Yichen", "账户安全"));
        System.out.println(num);


    }
}
