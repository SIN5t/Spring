package cn.edu.uestc.Proxy5_dynamic;

public interface AOP {
    default void before(){};
    default void after(){};
    default void exception(){};

}
