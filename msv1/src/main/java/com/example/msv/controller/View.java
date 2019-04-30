package com.example.msv.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 返回视图的控制器。
 */
@Controller
@Api(value = "返回视图名")
public class View {
    /**
     *
     * @return 返回默认界面
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
