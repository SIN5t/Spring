package cn.edu.uestc.s01;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *  此类为切面类,包含各种切面方法
 */
@Aspect //交给aspectj扫描这个类去处理
@Component //交给spring容器创建对象
public class MyAspect {
    /**
     * 所有切面的功能都是由切面方法来实现的
     * 可以将各种切面都在此类中进行开发
     *
     * 前置通知的切面方法的规范
     * 1)访问权限是public
     * 2)方法的返回值是void
     * 3)方法名称自定义
     * 4)方法没有参数,如果有也只能是JoinPoint类型
     * 5)必须使用@Before注解来声明切入的时机是前切功能和切入点
     *      参数:value  指定切入点表达式
     *
     * 业务方法
     * public String doSome(String name, int age)
     */


    /*
    //1、SomeServiceImpl下所有方法
    @Before(value = "execution(public String cn.edu.uestc.s01.SomeServiceImpl.*(String,int))")
    public void myBefore(){
        System.out.println("切面方法中的前置通知功能（before）实现");
    }*/

    /*
    //2、所有返回值类型，该类下所有方法，所有参数
    @Before(value = "execution(public * cn.edu.uestc.s01.SomeServiceImpl.*(..))")
    public void myBefore(){
        System.out.println("切面方法中的前置通知功能（before）实现");
    }*/

   /*
   //3、任意 访问权限，s01包下任意类 中 任意方法 中 任意参数
    @Before(value = "execution(* cn.edu.uestc.s01.*.*(..))")
    public void myBefore(){
        System.out.println("切面方法中的前置通知功能（before）实现");
    }*/

    /*
    //4、访问权限省略，uestc包下任意子路径 中 任意方法 中 任意参数
    @Before(value = "execution(* cn.edu.uestc..*(..))")
    public void myBefore(){
        System.out.println("切面方法中的前置通知功能（before）实现: execution(* cn.edu.uestc..*(..)");
    }*/
    @Before(value = "execution( * *(..))")
    public void myBefore(JoinPoint jp) {
        System.out.println("切面方法中的前置通知功能实现............");
        System.out.println("方法的签名是：" + jp.getSignature());
        //jp.getArgs()拿到的是一个数组
        // 如果想要把数组中的内容打印出来，直接使用toString方法只会打印出数组的地址，
        // 因此需要使用Arrays的toString方法，可以从其内部实现中看出来
        System.out.println("方法的参数是：" + Arrays.toString(jp.getArgs()));
    }

}
