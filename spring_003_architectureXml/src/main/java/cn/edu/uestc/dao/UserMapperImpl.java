package cn.edu.uestc.dao;

import cn.edu.uestc.pojo.Users;
import org.springframework.stereotype.Repository;
/*
1)创建对象的注解
	@Component:可以创建任意对象.创建的对象的默认名称是类名的驼峰命名法.也可以指定对象的名称@Component("指定名称").
	@Controller:专门用来创建控制器的对象(Servlet),这种对象可以接收用户的请求,可以返回处理结果给客户端.
	@Service:专门用来创建业务逻辑层的对象,负责向下访问数据访问层,处理完毕后的结果返回给界面层.
	@Repository:专门用来创建数据访问层的对象,负责数据库中的增删改查所有操作.
 */
@Repository //Repository:仓库
public class UserMapperImpl implements UserMapper{
    public int insert(Users users) {
        System.out.println(users + "成功插入!");
        return 1;
    }
}
