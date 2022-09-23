package cn.edu.uestc.Proxy5_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 和静态代理的区别是：静态代理使用 成员变量 完成业务方法：buy（） 后如果还想sing（）、、show（），就要改代码
 * 动态代理用反射自动去找方法
 * 而且不用继承Service方法！
 */
public class ProxyFactory {
    //获取动态代理对象,和静态代理区分，这里是以参数的形式传入
    public static Object getAgent(Service target,AOP aop){
        //类加载器
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的所有接口
                target.getClass().getInterfaces(),
                //代理功能的实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //类加载器
                            Object proxy,
                            //正在被调用的方法，buy（） show（） sing（）...
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                            Object obj = null;
                            try {
                                //切面
                                aop.before(); // 事务  日志...
                                //业务
                                obj = method.invoke(target,args);
                                //切面
                                aop.after();
                            }catch (Exception e){
                                //切面
                                aop.exception();
                            }
                            return obj;
                    }
                }
        );
    }
}
