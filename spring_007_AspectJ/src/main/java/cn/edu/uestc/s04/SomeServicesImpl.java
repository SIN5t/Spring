package cn.edu.uestc.s04;

import org.springframework.stereotype.Component;

@Component
public class SomeServicesImpl implements SomeServices{

    public Student changeRetVal(Student stu) {
        System.out.println("业务功能执行:" + stu);
        return stu;
    }
}
