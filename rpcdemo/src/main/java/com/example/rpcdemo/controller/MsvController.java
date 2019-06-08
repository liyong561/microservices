package com.example.rpcdemo.controller;

import com.example.rpcdemo.client.MsvClient;
import com.example.rpcdemo.entity.SimpleUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by yongli on 2019-06-08 15:52
 */
@RestController
@RequestMapping("/msv")
@Api(value = "dd")
public class MsvController {

    @Autowired
    MsvClient msvClient;

    @RequestMapping("/user")
    @ApiOperation(value = "this is no need param")
    public SimpleUser getUserFromRemote(){
        SimpleUser user = new SimpleUser(12,"df");
        return msvClient.get("bean/simple1",SimpleUser.class,user);
    }

}
