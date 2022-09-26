package cn.edu.uestc.service.impl;

import cn.edu.uestc.mapper.AccountsMapper;
import cn.edu.uestc.pojo.Account;
import cn.edu.uestc.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;

    public int add(Account account) {
        return accountsMapper.add(account);
    }
}
