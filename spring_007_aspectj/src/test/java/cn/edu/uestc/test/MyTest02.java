package cn.edu.uestc.test;

import cn.edu.uestc.s02.SomeServices;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void tests020(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeServices someServices = (SomeServices) ac.getBean("someServiceImpl");
        String zhangsan = someServices.doSome("zhangsan", 22);
        System.out.println(zhangsan);
    }

}
