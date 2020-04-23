package com.example.msv.controller;

import com.example.msv.entity.MapData;
import com.example.msv.entity.SimpleEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
//ctrl+/

/**
 * create by yongli on 2019-06-07 18:56，just
 *  for quick tab
 */
@RestController
@RequestMapping("/bean")
@Api("just for the usually object")
public class RestBean {

    @PostMapping("/date")
    @ApiOperation(value = "for date",notes = "we are for china")
    public Date getDate(@RequestBody Date date){
        return date;
    }

    @PostMapping("/simple1")
    @ApiOperation(value = "for a id and name",notes = "just a test")
    // 加了requestBody和没加的区别
    public SimpleEntity getSimpleEntity(@RequestBody SimpleEntity user){
        // a microphone,a
     return user;
    }

    @PostMapping("/simple2")
    @ApiOperation(value = "for a id and name",notes = "just a test")
    // 加了requestBody和没加的区别
    public MapData getSimpleEntity(@RequestBody MapData mapData){
        // a microphone
        return mapData;
    }
}
