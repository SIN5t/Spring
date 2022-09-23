package cn.edu.uestc.controller;

import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UserService;
import cn.edu.uestc.service.impl.UserServiceImpl;

/**
 * 界面层
 */
public class UserController {
    //如何去访问业务逻辑层,就是创建对象
    //切记切记:所有的界面层都会有业务逻辑层的对象
    public UserService userService = new UserServiceImpl();

    //界成层的功能实现,对外提供访问的功能
    public int insert(Users users){
        return userService.insert(users);

        //层层交付的思想，最底层数据访问层Use人MapperImpl的insert会输出 是否插入成功的语句
    }
}
