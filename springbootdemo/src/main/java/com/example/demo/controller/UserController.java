package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.redis.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user/news")
    public String news(Model model){
        // 数组转换为list
        List<String> colors = Arrays.asList(new String[] {"RED","GREEN","BLUE","ORANGE"});
        Map<String,String> map = new HashMap<>();
        for(int i=0; i<5;i++){
            map.put(String.valueOf(i),String.valueOf(i*20));
        }
        model.addAttribute("colors",colors);
        model.addAttribute("map",map);
        return "user/news";
    }


    @RequestMapping("user/header")
    public String header(){
        return "user/header";
    }

    @RequestMapping("user/welcome")
    public String welcome(){
        return "user/welcome";
    }

    @RequestMapping("user/user_info")
    @ResponseBody
    public User user_info(@RequestParam("user_name") String name,Model model) {
        User user= userService.selectByName(name);
        model.addAttribute("user",user);
        return user;
    }

    @RequestMapping("user/sign_out")
    public String sign_out(HttpServletRequest request){
        request.getSession().invalidate();
         // 这个session可能还存在。
        return "user/sign_in";
    }
    @GetMapping("user/sign_in")
    public String sign_in(){
        return "user/sign_in";
    }

    @PostMapping("user/sign_in")
    public String sign_in(User user, Model model, HttpServletRequest request){
        String name = user.getName();
        User  userDb= userService.selectByName(name);
        if (DigestUtils.md5DigestAsHex(user.getPwd().getBytes()).equals(userDb.getPwd())){
            model.addAttribute("user",user);
            //登录成功后，为了保持这个状态，要向session中写入标识信息,这个session的创建时用户第一次访问时自动创建的。
            request.getSession().setAttribute("user_name",name);
            return "user/welcome";
        }
        return "user/sign_in";
    }

    @GetMapping("user/sign_up")
    public String sign_up(){
        return "user/sign_up";
    }
    @PostMapping("user/sign_up")
    // 表单提交给User,sign_up注册
    public String sign_up(User user,Model model,HttpServletRequest request){
        String pwd = user.getPwd();
        String name =user.getName();
        String md5 = DigestUtils.md5DigestAsHex(pwd.getBytes());
        user.setPwd(md5);
        if(userService.add(user)){
            request.getSession().setAttribute("user_name",name);
            model.addAttribute("user",user);
            return "user/welcome";
        }
        else {
            return "user/sign_up";
        }
    }

}
