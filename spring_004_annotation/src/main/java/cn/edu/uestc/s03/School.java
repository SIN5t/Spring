package cn.edu.uestc.s03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("parentSchool")
public class School {
    @Value("电子科技大学")
    private String name;
    @Value("成都市")
    private String address;

    public School() {
        System.out.println("父类School的无参构造方法被调用");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
