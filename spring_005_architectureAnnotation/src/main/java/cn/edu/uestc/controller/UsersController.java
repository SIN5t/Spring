package cn.edu.uestc.controller;

import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 界面层
 */
@Controller("uController")//类的创建，名称是uController,在test里面用getBean（就传入这个名称）从而取出该对象
public class UsersController {
    @Autowired //同源类型依赖注入，注入的是实现类，这里就不同new
    @Qualifier("uService")
    UsersService usersService;
    //不需要继承接口，但是你想它肯定要面向用户，那肯定得提高服务啊！（这里不就是insert（））
    public int insert(Users users){
        //这里肯定又是传给下层
        return usersService.insert(users);

    }
}
