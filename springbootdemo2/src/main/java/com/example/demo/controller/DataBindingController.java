package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 在处理请求过程中，向前端页面发送数据，思考一下，有哪些方法？
 */
@Controller
public class DataBindingController {
    @Autowired
    BookService bookService;

    @RequestMapping("/addBook")
    public String addBoook(){
        Book book =new Book("232-32-32","活着","余华");
        bookService.add(book);
        // 会定位到html目录下吗？
        return "2019/home";
    }
    @RequestMapping("/bookone/{id}")
    public String getOne(Model model,@PathVariable("id") long id){
         // long id = Long.parseLong(request.getParameter("id")); 这个id不在request里面。
        model.addAttribute("book1",bookService.getOne(id));
        return "2019/thymeleaf01.html";
    }
    @RequestMapping("/deleteBook/{id}")
    @ResponseBody
    public String  delete(@PathVariable("id") Long id){
         // 这个Long型数据是怎么转换的？
        // Integer_Long自动转型
        bookService.delete(id);
        return "delete the book";
    }
}
