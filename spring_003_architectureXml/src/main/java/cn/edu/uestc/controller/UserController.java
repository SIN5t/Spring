package cn.edu.uestc.controller;

import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UserService;
import cn.edu.uestc.service.impl.UserServiceImpl;

/**
 *界面层
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public int insert(Users users){
        return userService.insert(users);
    }
}
