package cn.edu.uestc.pojo03;

public class Student {
    private String id;
    private String name;
    private int age;

    //引用类型的成员变量
    private School school;

    public Student(String id, String name, int age, School school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
