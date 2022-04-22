package org.example.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author why
 * @date 2022/4/16
 */
@Controller
@RequestMapping("/target")
public class TargetController {
    @RequestMapping("/show")
    public ModelAndView show(ModelAndView mv) {
        mv.setViewName("index");
        System.out.println(1 / 0);
        return mv;
    }

}
