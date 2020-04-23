package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller,RequestMapping是两个很典型的框架
 * DispatchServlet，这些都是耳熟能详的类。
 * 使用swagger使其能够更直观的看出
 */
@Controller
public class RestControllerTest {
    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "Hello,Springboot";
    }

    @RequestMapping("bookList")
    public String bookList(){
        return "bookList";
    }
}
