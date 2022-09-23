package cn.edu.uestc.service.impl;

import cn.edu.uestc.dao.UsersMapper;
import cn.edu.uestc.pojo.Users;
import cn.edu.uestc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/*
1)创建对象的注解
	@Component:可以创建任意对象.创建的对象的默认名称是类名的驼峰命名法.也可以指定对象的名称@Component("指定名称").
	@Controller:专门用来创建控制器的对象(Servlet),这种对象可以接收用户的请求,可以返回处理结果给客户端.
	@Service:专门用来创建业务逻辑层的对象,负责向下访问数据访问层,处理完毕后的结果返回给界面层.
	@Repository:专门用来创建数据访问层的对象,负责数据库中的增删改查所有操作.

	2)依赖注入的注解
    简单类型(8种基本类型+String)的注入
	@Value:用来给简单类型注入值

    引用类型的注入
    A.@Autowired:使用类型注入值,从整个Bean工厂中搜索同源类型的对象进行注入.
    同源类型也可注入.
    什么是同源类型:
      a.被注入的类型(Student中的school)与注入的类型是完全相同的类型
      b.被注入的类型(Student中的school父)与注入的类型(子)是父子类
      c.被注入的类型(Student中的school接口)与注入的类型(实现类)是接口和实现类的类型

    注意:在有父子类的情况下,使用按类型注入,就意味着有多个可注入的对象.此时按照名称进行二次筛选,选中与被注入对象相同名称的对象进行注入.

    B.@Autowired
      @Qualifier("名称"):使用名称注入值,从整个Bean工厂中搜索相同名称的对象进行注入.

    注意:如果有父子类的情况下,直接按名称进行注入值.
 */
/**
 *业务逻辑层的实现
 */
@Service("uService") //类的对象创建，并指定常见的引用名字，下一层界面层就进行成员变量的值注入，注入的就是用这个名字
public class UsersServiceImpl implements UsersService {

    //肯定有前一层的对象，这个对象可以用xml或者注解的方式让spring通过反射创建出来！！
    //@Value("userMapper") //注入依赖，value是简单类型的！！引用类型要想Autowired\Qualifier
    @Autowired //同源类型自动注入，就不用自己去new实现类了
    @Qualifier("uMapper")//bean工厂中搜索相同名称的对象进行导入
    UsersMapper usersMapper;

    public int insert(Users users) {
        //返回的肯定得是数据访问层的内容！
        return usersMapper.insert(users);
    }

}
