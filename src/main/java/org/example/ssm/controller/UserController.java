package org.example.ssm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ssm.pojo.User;
import org.example.ssm.pojo.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author why
 * @date 2022/4/12
 */
@Controller
public class UserController {
    @RequestMapping("/home")
    public ModelAndView index1(ModelAndView modelAndView) {
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }

    @RequestMapping("/home2")
    @ResponseBody
    public String index2() {
        return "ResponseBody";
    }

    @RequestMapping("/home3")
    public String index3() {
        return "/success.jsp";
    }

    @RequestMapping("/home4")
    @ResponseBody
    public String index4() throws JsonProcessingException {
        User user = new User(1, "why");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(user);
    }

    @RequestMapping("/home5")
    @ResponseBody
    public User index5() {
        return new User(1, "why");
    }

    @RequestMapping("/home6")
    public void index6(@RequestParam("name") String username) {
        System.out.println(username);
    }

    @RequestMapping(value = "/home7")
    @ResponseBody
    public void index7(User user) {
        System.out.println(user.toString());
    }

    @RequestMapping("/home8")
    @ResponseBody
    public void index8(VO vo) {
        System.out.println(vo.toString());
    }

    @RequestMapping("/home9")
    @ResponseBody
    public void index9(@RequestBody List<User> list) {
        System.out.println(list.toString());
    }

    @RequestMapping("/home10/{name}")
    @ResponseBody
    public void index10(@PathVariable("name") String name) {
        System.out.println(name);
    }

    @RequestMapping("/uploadOne")
    @ResponseBody
    public void uploadOne(MultipartFile multipartFile) throws IOException {
        String name = multipartFile.getOriginalFilename();
        multipartFile.transferTo(new File("C:/tmp/" + name));
    }

    @RequestMapping("/uploadMulti")
    @ResponseBody
    public void upload(MultipartFile[] multipartFiles) throws IOException {
        for (MultipartFile multipartFile : multipartFiles) {
            String name = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:/tmp/" + name));
        }

    }
}
