package cn.edu.uestc.service.impl;

import cn.edu.uestc.mapper.UsersMapper;
import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//交给Spring去创建对象
public class UsersServiceImpl implements UsersService {
    //切记切记:在所有的业务逻辑层中一定会有数据访问层的对象
    /**
     *         //1.读取核心配置文件
     *         InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
     *         //2.创建工厂对象
     *         SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
     *         //3.取出sqlSession
     *         sqlSession = factory.openSession(true);//自动提交事务
     *         //4.取出动态代理的对象,完成接口中方法的调用,实则是调用xml文件中相的标签的功能
     *         uMapper = sqlSession.getMapper(UsersMapper.class);
     */

    @Autowired //引用类型依赖注入的注解@Qualifier("名称"):使用名称注入值,从整个Bean工厂中搜索相同名称的对象进行注入;简单类型(8种基本类型+String)的注入@Value
    UsersMapper usersMapper;//UsersMapper是同源类型，创建过对象

    public int insert(Users user) {
        return usersMapper.insert(user);
    }
}
