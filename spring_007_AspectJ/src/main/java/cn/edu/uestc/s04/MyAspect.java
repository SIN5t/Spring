package cn.edu.uestc.s04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 输出的结构如下：这个就是最优化的结构！！
 *
 * 环绕通知中的前置通知的功能........
 * 前置通知的功能...
 * 业务功能执行:Student{name='郑元一', age=21}
 * 环绕通知中的后置通知的功能........
 * 无论业务功能能否实现，最终都一定会通知的功能.....
 * 后置通知的功能........
 * 测试方法中的返回值Student{name='吴亦宸', age=22}
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 最终通知方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值
     * 3)方法名称自定义
     * 4)方法没有参数,如果有也只能是JoinPoint
     * 5)使用@After注解表明是最终通知
     *   参数:
     *     value:指定切入点表达式
     */

    @After(value = "execution( * cn.edu.uestc.s04..*(..))")
    public void MyAfter(){
        System.out.println("无论业务功能能否实现，最终都一定会通知的功能.....");
    }

    @Before(value = "myCut()")
    public void MyBefore(){
        System.out.println("前置通知的功能...");
    }


    @Around(value = "myCut()")
    public Object MyAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知中的前置通知的功能........");
        Object obj = pjp.proceed(pjp.getArgs());
        Student stu = (Student)obj;
        stu.setName("吴亦宸");
        stu.setAge(22);
        System.out.println("环绕通知中的后置通知的功能........");
        return stu;
    }

    @AfterReturning(value = "myCut()",returning = "obj")
    public void MyAfterReturning(Object obj){
        System.out.println("后置通知的功能........");
    }

    @Pointcut(value = "execution(* cn.edu.uestc..*(..))")
    public void myCut(){}
    //方法名称带（）就是别名了！！

}
