package cn.edu.uestc.proxy3_static;

public class ProductServiceImpl implements Service{
    @Override
    public void buy() {
        System.out.println("商品购买成功！");
    }
}
