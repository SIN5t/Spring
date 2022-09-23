package cn.edu.uestc.test;

import cn.edu.uestc.Proxy5_dynamic.*;
import org.junit.Test;

public class MyTest {
    @Test
    public void testProxy5(){
        //拿到动态代理对象
        //输入ProxyFactory没有继承Service，但是它内部通过反射拿到了，所以可以强转为Service
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new logAopImpl());
        Service agent1 = (Service) ProxyFactory.getAgent(agent, new TransAopImpl());
        agent1.buy();

    }
    @Test
    public void testProxy52(){
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new logAopImpl());
        Service agent1 = (Service) ProxyFactory.getAgent(agent, new TransAopImpl());
        agent1.show(22);
    }

}

