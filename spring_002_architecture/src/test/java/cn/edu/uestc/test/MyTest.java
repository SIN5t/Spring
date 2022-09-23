package cn.edu.uestc.test;

import cn.edu.uestc.controller.UserController;
import cn.edu.uestc.pojo.Users;
import org.junit.Test;

public class MyTest {
    @Test
    public void testInsertUser(){
        //都进行测试了，肯定是和最外层进行沟通----界面层
        UserController userController = new UserController();
        int num = userController.insert(new Users("202222100309","Yichen Wu",22));//Yichen Wu添加成功 这是底层的sout语句
        System.out.println(num);//1
    }
}
