package cn.edu.uestc.Proxy4_static;

/**
 * 接口在定义的时候，+default 可以不必实现所有的方法，想中哪个就实现哪个
 *      比如在日志里面，只要重写一个before就够了。但是在事务中，需要代理所有的方法
 *
 */
public interface AOP {
    default void before(){};
    default void after(){};
    default void exception(){};

}
