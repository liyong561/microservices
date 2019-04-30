package com.example.msv.utils;

import com.rabbitmq.client.AMQP;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 从别人的项目学习，一点一滴。学习其好，抛弃其过时的
 * 对于cookie的操作，增删查，对于cookie，我们必须明白其封装在HttpRequest和HttpResponse中。
 * 写代码非常熟练的程度，就是不看资料，自己撸起袖子就开写，写完还能跑通，而且性能不错。
 * javax中的很多类，天生就是面向于http，面向于互联网的
 * 还有一个好习惯是如果发生异常，则应该显示异常信息，包括位置，可能原因，这样方便调试。
 */
public class CookieUtils {
    public static void addCookie(HttpServletResponse response, String name, String value, int maxAge) {
        if (maxAge < 0){
            maxAge =0;
        }
        Cookie cookie = new Cookie(name, value);
        /**
         * 比较好的习惯是设置一下生存时间，单位应该是second
         */
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);

    }
    public static void addCookie(HttpServletResponse response, String name, String value) {
        Cookie cookie = new Cookie(name, value);
        /**
         * 默认生存时间
         */
        cookie.setMaxAge(60 * 60 * 12 * 24);
        response.addCookie(cookie);

    }

    public static void clearCookie(HttpServletResponse response, String name) {
        /**
         * 所以看以看出cookie的名字很重要，具有唯一性，否则会覆盖
         */
        Cookie cookie = new Cookie(name, "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    public static String findByName(HttpServletRequest request, String name) {
        /**
         * 没有找到则返回null
         */
        String value = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)) {
                value = cookie.getValue();
            }
        }
        return value;
    }
}
