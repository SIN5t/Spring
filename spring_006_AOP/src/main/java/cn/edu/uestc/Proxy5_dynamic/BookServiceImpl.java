package cn.edu.uestc.Proxy5_dynamic;

public class BookServiceImpl implements Service{
    @Override
    public void buy() {
        System.out.println("图书购买完成");
    }
}
