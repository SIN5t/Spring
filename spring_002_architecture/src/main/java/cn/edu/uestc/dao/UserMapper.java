package cn.edu.uestc.dao;

import cn.edu.uestc.pojo.Users;

/**
 * 5.项目案例
 *   使用三层架构进行用户的插入操作.
 *   界面层,业务逻辑层,数据访问层(模拟).
 *
 *   Spring会接管三层架构中哪些对象的创建?界面层的对象,业务逻辑层的对象,数据访问层的对象.
 *
 *   非Spring接管下的三层项目构建:
 *   实体类
 *   com.bjpowernode.pojo  Users
 *   数据访问层
 *   com.bjpowernode.dao   UsersMapper.java(接口)
 *   						UsersMapperImpl.java(实现类)
 *   业务逻辑层
 *   com.bjpowernode.service   UsersService.java(接口)
 *   							UsersServiceImpl.java(实现类 )
 *   界面层
 *   com.bjpowernode.controller  UsersController.java
 */
public interface UserMapper {

    int insert(Users users);
}
