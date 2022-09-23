package cn.edu.uestc.Proxy4_static;

public class BookServiceImpl implements Service{
    @Override
    public void buy() {
        System.out.println("图书购买完成");
    }
}
