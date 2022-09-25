package cn.edu.uestc.test;

import cn.edu.uestc.s02.SomeServices;
import cn.edu.uestc.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void tests020(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeServices someServices = (SomeServices) ac.getBean("someServiceImpl");
        String zhangsan = someServices.doSome("zhangsan", 22);
        System.out.println("业务方法的返回值是：" + zhangsan);
    }
    @Test
    public void testS021(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeServices someServiceImpl = (SomeServices) ac.getBean("someServiceImpl");
        Student stu = someServiceImpl.changeRetVal(new Student("吴亦宸",22));
        System.out.println("业务方法执行完毕后的返回值是：" + stu);

    }

}
