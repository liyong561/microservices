package com.example.chengduservice.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by yongli on 2020-03-12 23:33
 *
 * springboot默认前端使用themeleaf引擎，会对页面的目录，后缀等进行配置
 * 默认是在templates目录下
 *  */
@Controller
@RequestMapping("/page")
public class UserPageController {

    @RequestMapping("/users")
    public String test(){
        return "index";
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
