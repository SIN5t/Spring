package cn.edu.uestc.proxy1;

/**
 * 版本一
 *      图书馆业务和事务切面耦合在一起
 *      //选中多行进行包裹try catch////// ctrl alt t
 */
public class BookServiceImpl {
    public void buyBook(){
        try {
            System.out.println("1、事务开启...");
            System.out.println("2、图书购买业务功能实现...");
            System.out.println("3、事务提交");
        }catch (Exception e){
            System.out.println("事务进行回滚.....");
        }
    }
}
