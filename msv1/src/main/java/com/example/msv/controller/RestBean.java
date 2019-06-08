package com.example.msv.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * create by yongli on 2019-06-07 18:56
 */
@RestController
@RequestMapping("/bean")
@Api("just for the usually object")
public class RestBean {

    @GetMapping("date")
    @ApiOperation(value = "for date",notes = "we are for china")
    public Date getDate(@RequestBody Date date){
        return date;
    }
}
