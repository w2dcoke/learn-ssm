package org.example.ssm.service;

import org.example.ssm.pojo.Account;

import java.util.List;

/**
 * @author why
 * @date 2022/4/17
 */
public interface AccountService {
    Account findOne(Integer id);

    int save();

    List<Account> findAll();
}
