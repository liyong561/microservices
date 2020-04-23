package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 */
@Controller
public class DispatcherControllerTest {
    /**
     * 向用户返回一个页面。
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "/index.html";
    }
    @RequestMapping("/formTest")
    public String formTest(){
        return "templates/formTest.html";
    }
    @RequestMapping("/addCookie")
    @ResponseBody
    public String addCookie(HttpServletRequest request, HttpServletResponse response){
        // 一次会话就可形成request和response.
        Cookie cookie1 =new Cookie("name","liyong");
        response.addCookie(cookie1);
        return "/addCookie.html";
    }
    @RequestMapping("/getCookie")
    @ResponseBody
    public String getCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        Cookie cookie1=null;
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("name"));
            cookie1 =cookie;
        }
        return "name:"+cookie1.getName()+";Domain:"+cookie1.getDomain()+";path:"+cookie1.getPath()+";time:"+cookie1.getMaxAge()
                +"value"+cookie1.getValue();
    }
    @RequestMapping("/cnblogsLogin")
    public String cnblogsLogin(){
        return "cnblogsLogin.html";
    }
    @RequestMapping("/addHttpSession")
    @ResponseBody
    public String addHttpSession(HttpServletRequest request, HttpServletResponse response){
        //httpSesion存储在服务器端，且在内存中，所以内存管理相当重要。
        // 使用观察者模式怎么监听事件？
        HttpSession httpSession =request.getSession();
        httpSession.setAttribute("name","liong");
        httpSession.setMaxInactiveInterval(60);

        return "id:"+httpSession.getId()+";name:"+httpSession.getAttribute("name");
    }
    @RequestMapping("/getHttpSession")
    @ResponseBody
    public String getHttpSesion(HttpServletRequest request, HttpServletResponse response){
        // false会抛出异常，因为server没有信息可以判定两次访问是同一个client。
        HttpSession httpSession = request.getSession(false);

        return "id:"+httpSession.getId()+";name:"+httpSession.getAttribute("name");
    }

    //测试一下对于抛出异常的处理。
    @RequestMapping("/p*")
    public String pe() throws IOException{
        throw new IOException("Io 异常");
    }

    @ExceptionHandler()
    @ResponseBody
    public String  error(Exception e){
        return "Error:"+e.getMessage();
    }

}