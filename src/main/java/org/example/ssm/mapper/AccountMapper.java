package org.example.ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.ssm.pojo.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author why
 * @date 2022/4/17
 */

public interface AccountMapper {
    Account findOne(@Param("id") Integer id);

    List<Account> findAll();
}
