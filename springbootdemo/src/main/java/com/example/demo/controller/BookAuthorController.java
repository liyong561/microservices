package com.example.demo.controller;

import com.example.demo.model.BookAuthor;
import com.example.demo.redis.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *url到资源的映射。
 * 给用户一个表单，把信息填写进去。
 */
@Controller
public class BookAuthorController {
    @Autowired
    BookAuthorService bookAuthorService;
    /**
     * @ ResponseBody注解会自动将注解object转换为json字符串
     */
    @GetMapping("/bookAuthor/add")
    public String add(){

        return "bookAuthor/add";
    }

    @PostMapping("/bookAuthor/add")
    @ResponseBody
    public  BookAuthor add(BookAuthor bookAuthor){
        bookAuthorService.add(bookAuthor);
        return bookAuthor;
    }
    @ResponseBody
    @GetMapping("/bookAuthor/select")
    public List<BookAuthor> select()
    {
        return bookAuthorService.selectByCountry("中国");
    }
    @ResponseBody
    public List<BookAuthor> select(String country){
        return bookAuthorService.selectByCountry(country);
    }

}
