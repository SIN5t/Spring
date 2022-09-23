package cn.edu.uestc.service.impl;

import cn.edu.uestc.dao.UserMapper;
import cn.edu.uestc.dao.UserMapperImpl;
import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UserService;

/**
 * 业务逻辑层的实现
 */
public class UserServiceImpl implements UserService {

    //切记切记，在业务逻辑层中，都必然有数据访问层的对象，就是通过这样的方式实现两层之间互联
    //以成员变量的形式出现。一定是接口指向实现！！
    private UserMapper userMapper = new UserMapperImpl();


    public int insert(Users users) {
        //添加更复杂的业务,但是我们现在没有复杂业务
        return userMapper.insert(users);
    }

}
