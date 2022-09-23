package cn.edu.uestc.dao;

import cn.edu.uestc.pojo.Users;

/**
 * 数据访问层
 */
public class UserMapperImpl implements UserMapper{
    public int insert(Users users) {
        System.out.println(users.getUname() + "添加成功");
        return 1;
    }
}
