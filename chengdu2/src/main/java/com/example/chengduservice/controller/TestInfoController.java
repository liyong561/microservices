package com.example.chengduservice.controller;

import com.example.chengduservice.entity.Hotel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("v1/acc")
@RestController
//@ApiOperation("")
@Api(description = "this is ths first class")
public class TestInfoController {
    /**
     * 获取工商信息
     *
     * @param accId
     * @return
     * AccInfo自动作为example value？
     */
    @GetMapping("/{accId}")
    @ApiOperation("this is for query the accommodation")
    Hotel getById(@PathVariable("accId") int accId) {

        return null; // 编译检查语句是降低了编码难度
    }

    @PostMapping("")
    @ApiOperation("插入工商信息")
    Hotel addAcc(Hotel accInfo){
        // 伪造的一个测试用例
        return accInfo;
    }


    @PostMapping("/add")
    @ApiOperation("插入工商信息")
    Hotel addAcc2(@RequestBody Hotel accInfo){
        // 返回这个对象json格式，没有进行任何封装。
        return accInfo;
    }
}
