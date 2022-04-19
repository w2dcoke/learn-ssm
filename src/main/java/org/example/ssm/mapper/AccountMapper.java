package org.example.ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.ssm.pojo.Account;

import java.util.List;

/**
 * @author why
 * @date 2022/4/17
 */

public interface AccountMapper {
    Account findOne(@Param("id") Integer id);

    List<Account> findAll();

    int save(Account account);

    int update(Account account);

    int deleteById(Integer id);
}
