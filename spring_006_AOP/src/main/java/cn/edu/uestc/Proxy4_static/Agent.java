package cn.edu.uestc.Proxy4_static;
/**
 *  静态代理的思想一定掌握了！
 *      两套功能，一套接口
 *      设计成员变量的类型为接口,为了灵活切换目标对象，到时候想代理谁的主业务功能，传入就好（刘德华、周深）
 *      选中多行进行包裹try catch    ctrl alt t
 *
 *       问题是切面太固定了，不能动态地修改切面的功能，不能加切面等等
 *       解决思路类似，代理类中的成员变量设置为接口，来一个切面的接口，用构造方法传入切面接口的具体值（比如是要事务，还是要日志）
 *
 *      静态代理实现了不同用户的Impl代理，能代理不同业务（既可以代理刘德华，又可以代理周深），
 *          动态代理能做到：任意的方法来，都能代理（不止是buy，sing(),show()...）内部就是反射拿到method，用method.invoke（对象，参数）进行实现的！
 */
public class Agent implements Service {
    //传入目标业务对象，切面对象，作为类中成员变量
    public Service target;
    public AOP aop;

    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    public void buy(){
        try {
            //切面
            aop.before();
            //事务
            target.buy();
            //切面
            aop.after();
        }catch (Exception e){
            //切面
            aop.exception();
        }
    }
}
