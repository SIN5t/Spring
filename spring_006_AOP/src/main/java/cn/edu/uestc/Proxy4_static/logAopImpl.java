package cn.edu.uestc.Proxy4_static;

public class logAopImpl implements AOP{
    @Override
    public void before() {
        System.out.println("before模块完成日志记录");
    }
}
