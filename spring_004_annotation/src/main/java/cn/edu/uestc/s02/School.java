package cn.edu.uestc.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {

    @Value("电子科技大学")
    private String name;
    @Value("成都市")
    private String address;

    public School() {
        System.out.println("学校的无参构造方法执行");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
