package com.example.chengduservice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.chengduservice.entity.Comment;
import com.example.chengduservice.util.CommonResult;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller文件也可以有接口的，但是简化开发，就省去了该部分，
 * 并且这个访问接口（也就是访问接口）可能设计的有问题，后期需要更改。
 * 在请求资源的过程，一个很重的步骤是信息（message）转换，比如将对象转换为json数据
 * 以前返回的是jsp的页面，但是Rest风格是面向资源的，HttpMessageConverter就很重要了
 */
@RestController
@RequestMapping("/comment")
@Api(value = "this is for comment")
public class CommentController {

    private final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @PostMapping("/room")
    public CommonResult mirror(@RequestBody String req){
        logger.info(req);
        /**
         * "result": "{\"name\":\"liyong\"}",可是种格式真的很难看
         */
        JSONObject ret = JSON.parseObject(req);
        return CommonResult.success(ret);
    }

    @PostMapping("/add")
    public CommonResult entity(@RequestBody Comment comment){
        logger.info(comment.toString());
        /**
         * "result": "{\"name\":\"liyong\"}",可是种格式真的很难看
         */
        return CommonResult.success(comment);
    }
}
