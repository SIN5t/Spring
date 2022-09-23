package cn.edu.uestc.test;
/**
 * 层层添加切面如何实现？？
 *      注意，在写Agent类的时候，构造方法传入初始值的是两个接口！！而Agent也实现了Service，它自己也可以被传入！
 *
 */

import cn.edu.uestc.Proxy4_static.*;
import org.junit.Test;

public class MyTest04 {
    @Test
    public void testProxy4(){
        //Agent agent = new Agent(new BookServiceImpl(),new TransAopImpl());
        Service agent = new Agent(new BookServiceImpl(),new TransAopImpl());//接口指向实现！！
        //实现套多个接口
        Service agent1 = new Agent(agent,new logAopImpl());//此时target=agent
        agent1.buy();
    }
}
