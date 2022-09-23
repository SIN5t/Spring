package cn.edu.uestc.s02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//创建的对象的默认名称是类名的驼峰命名法.也可以指定对象的名称@Component("指定名称").
@Component//此时Student对象的名称就是student
public class Student {
    @Value("张三")
    private String name;
    @Value("22")
    private int age;

    //引用类的数据类型  Autowired使用类型注入值,从整个Bean工厂中搜索同源类型的对象进行注入
    @Autowired
    @Qualifier("school")//按名称注入需要这两个标签都有！
    private School school;

    public Student() {
        System.out.println("学生的无参构造方法执行！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
