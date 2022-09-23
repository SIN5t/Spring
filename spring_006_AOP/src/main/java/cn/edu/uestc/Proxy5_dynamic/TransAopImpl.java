package cn.edu.uestc.Proxy5_dynamic;

public class TransAopImpl implements AOP{
    @Override
    public void before() {
        System.out.println("事务开启...");
    }

    @Override
    public void after() {
        System.out.println("事务结束...");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚...");
    }
}
