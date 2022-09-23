package cn.edu.uestc.service;

import cn.edu.uestc.pojo.Users;

/**
 * 业务逻辑层
 */
public interface UserService {
    //新增用户
    int insert(Users users);
}
