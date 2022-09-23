package cn.edu.uestc.Proxy4_static;

public class ProductServiceImpl implements Service{

    @Override
    public void buy() {
        System.out.println("商品购买业务完成~");
    }
}
