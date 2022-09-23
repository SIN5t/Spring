package cn.edu.uestc.pojo;

public class Users {
    private String uid;
    private String uname;
    private int age;

    public Users() {
    }

    public Users(String uid, String uname, int age) {
        this.uid = uid;
        this.uname = uname;
        this.age = age;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


