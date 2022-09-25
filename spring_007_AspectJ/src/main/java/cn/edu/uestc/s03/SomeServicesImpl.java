package cn.edu.uestc.s03;

import org.springframework.stereotype.Component;

/**
 * 业务逻辑层
 */
@Component
public class SomeServicesImpl implements SomeServices{
    public String doSome(String name, int age) {
        System.out.println("doSome业务被执行..." + name);
        return "abcd";
    }
}
