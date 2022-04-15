package org.example.ssm;

import org.example.ssm.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author why
 * @date 2022/4/14
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testQueryOne() {
        Account account = jdbcTemplate.queryForObject("select * from account where id=?",
                new BeanPropertyRowMapper<Account>(Account.class),
                1);
        System.out.println(account);
    }

    @Test
    public void testQueryAll() {
        List<Account> list = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(list);
    }

    @Test
    public void queryCount() {
        int count = jdbcTemplate.queryForObject("select count(id) from account", Integer.class);
        System.out.println(count);
    }

    @Test
    public void testInsert() {
        int row = jdbcTemplate.update("insert into account values(?,?,?)", null, "lele", 100);
        System.out.println(row);

    }

    @Test
    public void testUpdate() {
        int row = jdbcTemplate.update("update account set money=? where name=?", 1, "lele");
        System.out.println(row);
    }

    @Test
    public void testDelete() {
        int row = jdbcTemplate.update("delete from account where id=?", 4);
        System.out.println(row);
    }
}
