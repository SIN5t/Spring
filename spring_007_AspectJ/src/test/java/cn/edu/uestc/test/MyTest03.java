package cn.edu.uestc.test;

import cn.edu.uestc.s03.SomeServices;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void tests03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        SomeServices services = (SomeServices) ac.getBean("someServicesImpl");
        String zhangsan = services.doSome("zhangsan", 22);
        System.out.println("业务功能中的输出是：" + zhangsan);

    }
}
