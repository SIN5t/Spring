package cn.edu.uestc.pojo;

public class Student {
    private String name;
    private int id;

    public Student() {
        System.out.println("new对象的时候，自动调用了无参构造！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
