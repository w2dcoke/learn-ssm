package org.example.ssm.service;

import org.example.ssm.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author why
 * @date 2022/4/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void findAll() {
        System.out.println(accountService.findAll());
    }

    @Test
    public void findOne() {
        System.out.println(accountService.findOne(1));
    }

}