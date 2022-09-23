package cn.edu.uestc.test;

import cn.edu.uestc.proxy1.BookServiceImpl;
import org.junit.Test;

//选中多行进行包裹try catch////// ctrl alt t

public class MyTest02 {
    @Test
    public void testProxy2(){
        //还是接口指向实现类
        BookServiceImpl bookService = new BookServiceImpl();
        //多态，父类型的引用也可以有代理的全部业务
        bookService.buyBook();
    }
}
