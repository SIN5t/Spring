package cn.edu.uestc.s03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //这是创建对象的注解！和依赖注入的注解区分
public class Student {
    @Value("李四")
    private String name;
    @Value("22")
    private int age;
    @Autowired //按类型导入
    @Qualifier("parentSchool") //有父和子的情况下，使用名称注入值！
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public Student() {
        System.out.println("学生的无参构造方法被调用");
    }
}
