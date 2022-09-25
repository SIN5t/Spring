package cn.edu.uestc.s02;

import org.springframework.stereotype.Component;

/**
 * 业务逻辑层的实现类
 */
@Component
public class SomeServiceImpl implements SomeServices{
    public String doSome(String name, int age) {
        System.out.println("doSome业务执行成功!!");
        return "abcd";
    }

    public Student changeRetVal(Student stu) {
        return stu;
    }


}
