package cn.edu.uestc.test;

import cn.edu.uestc.s01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void testS010(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //一定注意，这里的getBean("someServiceImpl") 注解创建对象的时候，如果指定了名字就是对应的名字。没指定里面驼峰命名。
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        //String zhangsan = someService.doSome("zhangsan", 22);
        //System.out.println(zhangsan);

        System.out.println(someService.getClass());//class com.sun.proxy.$Proxy17 说明这个someService已经是动态代理了！！！
        someService.show();
    }

    @Test
    public void testS011(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //一定注意，这里的getBean("someServiceImpl") 注解创建对象的时候，如果指定了名字就是对应的名字。没指定里面驼峰命名。
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.getClass());//class com.sun.proxy.$Proxy17 说明这个someService已经是动态代理了
        String zhangsan = someService.doSome("zhangsan", 22);
        System.out.println(zhangsan);
    }
}
