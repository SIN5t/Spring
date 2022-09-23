package cn.edu.uestc.test;

import cn.edu.uestc.proxy3_static.Agent;
import cn.edu.uestc.proxy3_static.BookServiceImpl;
import cn.edu.uestc.proxy3_static.ProductServiceImpl;
import org.junit.Test;

public class MyTest03 {
    @Test
    public void testProxy03(){
        //Agent agent = new Agent(new BookServiceImpl());
        Agent agent = new Agent(new ProductServiceImpl());
        agent.buy();
    }
}
