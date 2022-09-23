package cn.edu.uestc.Proxy5_dynamic;

public class logAopImpl implements AOP{
    @Override
    public void before() {
        System.out.println("before阶段的切片，日志记录成功");
    }
}
