package cn.edu.uestc.Proxy5_dynamic;

public interface Service {
    void buy();

    //增加有参有放的方法测试代理功能
    //谁想实现这个功能谁去实现就行
    default String show(int age){
        System.out.println("有返回值和测试，show方法被调用....age = " + age);
        return "abcd";
    }
}
