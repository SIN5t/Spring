package cn.edu.uestc.service.impl;

import cn.edu.uestc.dao.UserMapper;
import cn.edu.uestc.dao.UserMapperImpl;
import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UserService;

/**
 * 业务逻辑
 */
public class UserServiceImpl implements UserService {
    //切记切记，在业务逻辑层中，都必然有数据访问层的对象，就是通过这样的方式实现两层之间互联
    //以成员变量的形式出现。一定是接口指向实现！！
    //下面这里就不要new了，把这个功能交给spring来做
    public UserMapperImpl userMapper;

    public UserMapperImpl getUserMapper() {
        return userMapper;
    }
    //交给spring注入依赖，必须要有set方法！！！
    public void setUserMapper(UserMapperImpl userMapper) {
        this.userMapper = userMapper;
    }

    public int insert(Users users) {
        return userMapper.insert(users);
    }
}
