package cn.edu.uestc.proxy3_static;
/**
 *  静态代理的思想一定掌握了！
 *      两套功能，一套接口
 *      设计成员变量的类型为接口,为了灵活切换目标对象，到时候想代理谁的主业务功能，传入就好（刘德华、周深）
 *      选中多行进行包裹try catch////// ctrl alt t
 *
 *      静态代理实现了不同用户的Impl代理，能代理不同业务（既可以代理刘德华，又可以代理周深），
 *          但是问题是切面太固定了，不能动态地修改切面的功能，不能加切面等等
 *          解决思路类似，代理类中的成员变量设置为接口，来一个切面的接口，用构造方法传入切面接口的具体值（比如是要事务，还是要日志）
 *
 */
public class Agent implements Service{
    //设计成员变量的类型为接口,为了灵活切换目标对象,到时候想买书，new BookServiceImpl（接口指向实现），想买商品....
    Service target;
    public Agent(Service target){
        this.target = target;
    }

    @Override
    public void buy() {
        try {
            //切面功能
            System.out.println("事务开启");//写死了
            //主业务功能
            target.buy();//写活了
            //切面功能
            System.out.println("事务提交");//写死了
        } catch (Exception e) {
            System.out.println("事务回滚");//写活了
        }
    }

}
