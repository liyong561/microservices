package com.example.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 需要注册。@Component注册一下。
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    Logger logger= LoggerFactory.getLogger(LoginInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session =request.getSession();
        if (session.getAttribute("user_name")!=null){
            String name= (String) session.getAttribute("user_name");
            return true;
        }
        // request中可以，ThreadLocal也可以。拦截器中html可以访问。
        logger.info("拦截器调用");
        // 将用户重定向至登录界面。
        response.sendRedirect("/user/sign_up");
        return true;
    }
}
