package cn.edu.uestc.pojo;

public class Account {
    //规范用封装类
    private Integer aId;
    private String aName;
    private String aContent;

    public Account(Integer aId, String aName, String aContent) {
        this.aId = aId;
        this.aName = aName;
        this.aContent = aContent;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aContent='" + aContent + '\'' +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }
}
