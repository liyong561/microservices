package com.example.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.Date;

/**
 * 从Filter可以看出，其作用有点类似Controller。
 *WebFilter拦截这些url请求。
 * async:非同步的，异步的，
 */
@WebFilter(filterName = "myFilter",urlPatterns = {"*.jpg","*.gif"},asyncSupported = true)
@Component
public class LoggingFilter  implements Filter {
    PrintWriter logger;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        File file=new File("");
        String path=null;
        try {
             path = file.getCanonicalPath();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("logger path:"+path);
        try {
             logger =new PrintWriter(new File(path,"filter.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 提前对这些请求做过滤操作。
        System.out.println(request.getRemoteAddr());
        HttpServletRequest hts= (HttpServletRequest)request;
        logger.println(new Date()+" "+hts.getRequestURI());
        System.out.println(" a request reached");
        logger.flush(); // PrintWriter的写法。
        // 请求向下传递。
        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {
        if(logger!=null){
            logger.close();
        }

    }
}
