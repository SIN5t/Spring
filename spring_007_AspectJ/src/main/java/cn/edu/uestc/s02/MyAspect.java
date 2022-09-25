package cn.edu.uestc.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *  此类为切面类,包含各种切面方法
 */

@Aspect
@Component
public class MyAspect {
    /**
     * 后置通知的方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值void
     * 3)方法名称自定义
     * 4)方法有参数(也可以没有参数,如果目标方法没有返回值,则可以写无参的方法,但一般会写有参,这样可以处理无参可以处理有参),这个切面方法的参数就是目标方法的返回值
     * 5)使用@AfterReturning注解表明是后置通知
     *   参数:
     *      value:指定切入点表达式
     *      returning:指定目标方法的返回值的名称,则名称必须与切面方法的参数名称一致.
     */

    //注意这里的returning写obj
    @AfterReturning(value = "execution(* cn.edu.uestc.s02.*.*(..))",returning = "obj")
    public void MyAfterReturning(Object obj){
        System.out.println("afterReturning 后置函数执行成功...");
        if (obj!=null){//AfterReturning对应的那个业务函数不一定有返回值的，所以判断一下
            if (obj instanceof String){//动态代理代理多套业务，不同业务可能返回值类型不同！！！
                String s = ((String) obj).toUpperCase();
                System.out.println("切面方法中afterReturning 后置函数对返回值进行处理后输出" + s);
            }
            if(obj instanceof Student){
                //现在想试试修改返回值
                Student stu = (Student) obj;
                stu.setName("李元一");
                stu.setAge(21);
                System.out.println("切面方法中的返回值：" + stu);
            }
        }
    }
}
