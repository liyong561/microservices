package com.example.msv.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class UseController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/book")
    public String getBook(@PathVariable(name = "get",required = false) String get){
        JSONObject js = new JSONObject();
        String sql = "select * from book where author = ?";
        // 表字段到对象属性的映射。
        // jdbcTemplate.query(sql,);
        return "fn";
    }

}
