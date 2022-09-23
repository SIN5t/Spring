package cn.edu.uestc.pojo03;

public class School {
    private String name;
    private String address;

    //联系通过构造方法注入，这时候不需要写无参构造和set方法
    public School(String name1, String address1) {
        this.name = name1;
        this.address = address1;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
