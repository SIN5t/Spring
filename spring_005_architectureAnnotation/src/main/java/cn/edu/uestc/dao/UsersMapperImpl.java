package cn.edu.uestc.dao;

import cn.edu.uestc.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * 数据访问层实现类
 */
@Repository("uMapper")//下一层业务逻辑层有这个成员变量，值注入的时候，用的名字就是@Qualifier("uMapper")//bean工厂中搜索相同名称的对象进行导入
public class UsersMapperImpl implements UsersMapper{
    public int insert(Users users) {
        System.out.println("数据访问层成功完成insert操作！！");
        return 1;
    }
}
