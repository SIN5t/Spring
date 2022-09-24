package cn.edu.uestc.s01;

import org.springframework.stereotype.Service;

/**
 * 业务的实现类
 */
@Service  //创建对象的注解,专门负责创建业务逻辑层的对象，负责向下访问数据访问层,处理完毕后的结果返回给界面层.
public class SomeServiceImpl implements SomeService{

    public String doSome(String name,int age) {
        System.out.println("doSome业务执行.........");
        return "返回值类型是String";
    }

    public void show() {
        System.out.println("show业务执行.......");
    }
}
