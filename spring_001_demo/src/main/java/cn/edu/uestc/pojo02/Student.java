package cn.edu.uestc.pojo02;

public class Student {
    private int age;
    private String name;
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", " + school +
                '}';
    }

    public Student(){
        System.out.println("Student类中的无参构造方法被创建");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
