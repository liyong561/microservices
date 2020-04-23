package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/useCss")
public class UseCssController {

    @RequestMapping("/beautiful01")
    public String bt01(){
        return "useCss/beautiful01";
    }

    @RequestMapping("/beautiful02")
    public String bt02(){
        return "useCss/beautiful02";
    }

    @RequestMapping("/table01")
    public String table01(){
        return "useCss/table01";
    }
    @RequestMapping("/table02")
    public String table02(){
        return "useCss/table02";
    }
}
