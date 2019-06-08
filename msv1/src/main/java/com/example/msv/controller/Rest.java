package com.example.msv.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.msv.entity.Airplane;
import com.example.msv.entity.SimpleEntity;
import com.example.msv.service.JsonObjectService;
import com.example.msv.utils.CookieUtils;
import com.example.msv.utils.ResultFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.msv.service.HelloService;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@RestController
@Api(value = "简单api接口",description= "方法没有参数，不用访问数据库")
public class Rest {
    /**
     * 用于跟踪类信息,看来大家都使用slf4j,spring boot应该自动加入了这个依赖
     */
    Logger  logger = LoggerFactory.getLogger(Rest.class);

    @Autowired
    HelloService helloService;

    @Autowired
    JsonObjectService jsonObjectService;

    /**
     * √Optional int parameter 'counter' is present but cannot be translated into a null value due to being
     * declared as a primitive type. Consider declaring it as object wrapper for the corresponding primitive type.
     * @param counter 在网络中传输的数据，最好封装成对象。
     * @return
     */
    @GetMapping("/helloP")
    @ApiOperation(value = "打招呼用语",notes = "there is no notes")
    public String hello(HttpServletRequest request, HttpServletResponse response, @Param("counter") Integer counter) {
        HttpSession session = request.getSession();
        CookieUtils.addCookie(response,"sessionId",session.getId());
        logger.info("hello method");
        // counter = new Random().nextInt();
        return helloService.sayHello()+counter+session.getId();

    }
    @GetMapping("/hello")
    public ResultFactory hello(HttpServletRequest request){
        try{
        String cookieName = CookieUtils.findByName(request,"sessionId");
        }catch (Exception e){
            return ResultFactory.erorr().put("sessionId",e.toString());
        }


        HttpSession session = request.getSession();
        SimpleEntity sm = new SimpleEntity(12,"fd");
        // session设计时，首先就得考虑到序列化
        return ResultFactory.ok();
    }

    @GetMapping("/airplane/object")
    @ApiOperation(value = "再见用语", notes = "there is no notes")
    public Airplane airplaneObject() {
        return jsonObjectService.getAirplane();
    }

    @GetMapping("/airplane/json")
    @ApiOperation(value = "再见用语", notes = "there is no notes")
    public String airplaneJson() {

        return jsonObjectService.getAirplaneJsonObject();
    }

    /**
     *
     * @param request
     * @return sesssion的字符串，为什么不是session对象
     */
    @GetMapping("/session")
    public   Object getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        return JSONObject.toJSON(session);
    }
}
