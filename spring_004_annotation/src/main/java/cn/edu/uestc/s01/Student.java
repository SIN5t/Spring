package cn.edu.uestc.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//创建的对象的默认名称是类名的驼峰命名法.也可以指定对象的名称@Component("指定名称").
@Component("stu")//交给Spring去创建对象,就是在容器启动时创建
public class Student {
    @Value("202222100308")
    private String id;
    @Value("zhangsan")
    private String name;
    @Value("22")
    private int age;

    public Student() {
        System.out.println("创建对象的时候，无参构造执行！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
