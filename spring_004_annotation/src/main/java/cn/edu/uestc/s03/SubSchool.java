package cn.edu.uestc.s03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("subSchool")
public class SubSchool extends School{
    @Value("电子科大附属小学")
    private String name;
    @Value("郫都区")
    private String address;

    //执行
    // 子类的时候会默认调用父类的无参构造！！！！！
    //注意:在有父子类的情况下,使用按类型注入,就意味着有多个可注入的对象.此时按照名称进行二次筛选,选中与被注入对象相同名称的对象进行注入.
    //注意:如果有父子类的情况下,直接按名称进行注入值.
    public SubSchool() {
        System.out.println("子类SubSchool的无参构造执行");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
