package cn.edu.uestc.Proxy4_static;

public class TransAopImpl implements AOP{
    @Override
    public void before() {
        System.out.println("before阶段完成事务注册...");
    }

    @Override
    public void after() {
        System.out.println("事务结束...");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚");
    }
}
