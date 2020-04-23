package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/learnHtml")
public class LearnHtmlController {
    /**
     * 快注释快捷键，this use what viewResolver?
     */
    @RequestMapping("forLabel")
    public String forLabel() {
        return "/learnHtml/forLabel";

    }

    @RequestMapping("frame")
    public String frame() {
        return "/learnHtml/forFrameset";
    }
}
