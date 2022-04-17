package org.example.ssm.service;

import org.example.ssm.mapper.AccountMapper;
import org.example.ssm.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author why
 * @date 2022/4/17
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findOne(Integer id) {
        return accountMapper.findOne(id);
    }

    @Override
    public int save() {
        return 0;
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

}
