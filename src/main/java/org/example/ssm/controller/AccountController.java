package org.example.ssm.controller;

import org.apache.ibatis.annotations.Param;
import org.example.ssm.pojo.Account;
import org.example.ssm.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author why
 * @date 2022/4/22
 */
@Controller
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/find")
    public String Account() {
        return "find";
    }

    @RequestMapping("save")
    public String save() {
        return "save";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete";
    }

    @RequestMapping("/update")
    public String update() {
        return "update";
    }

    @GetMapping("/account")
    @ResponseBody
    public Account find(@RequestParam("id") Integer id) {
        return accountService.findOne(id);
    }

    @PostMapping("/account")
    @ResponseBody
    public String save(Account account) {
        accountService.save(account);
        return "success";
    }

    @DeleteMapping("/account")
    @ResponseBody
    public String delete(@Param("id") Integer id) {
        accountService.deleteById(id);
        return "success";
    }

    @PutMapping("/account")
    @ResponseBody
    public String update(Account account) {
        accountService.update(account);
        return "success";
    }
}