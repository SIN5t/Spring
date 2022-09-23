package cn.edu.uestc.proxy2;

import cn.edu.uestc.proxy1.BookServiceImpl;

/**
 * 子类代理添加一些功能
 * //选中多行进行包裹try catch////// ctrl alt t
 */
public class SubBookServiceImpl extends BookServiceImpl {
    @Override
    public void buyBook() {
        try {
            //事务切面
            System.out.println("事务开启...");
            //主业务实现
            super.buyBook();
            //事务切面
            System.out.println("事务结束...");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }

    }
}
