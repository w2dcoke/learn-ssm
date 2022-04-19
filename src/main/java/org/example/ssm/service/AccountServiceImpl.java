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
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public int save(Account account) {
        return accountMapper.save(account);
    }

    @Override
    public int update(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public int deleteById(Integer id) {
        return accountMapper.deleteById(id);
    }

}
