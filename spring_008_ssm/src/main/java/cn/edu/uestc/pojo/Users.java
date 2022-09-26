package cn.edu.uestc.pojo;

public class Users {
    private Integer uId;
    private String uName;
    private String uPass;

    public Users(Integer uId, String uName, String uPass) {
        this.uId = uId;
        this.uName = uName;
        this.uPass = uPass;
    }

    public Users() {
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                '}';
    }
}
