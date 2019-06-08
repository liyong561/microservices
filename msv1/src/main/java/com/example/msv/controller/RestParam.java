package com.example.msv.controller;

import com.example.msv.entity.SimpleEntity;
import com.example.msv.entity.UserEntity;
import com.example.msv.utils.ResultFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** 记住*和/不能分行，这很重要
 * create by yongli on 2019-06-06 23:17
 * controller控制器中的方法也是普通方法，但是特殊之处在也其传递的参数和一般参数相比，较为简单，如绝大多数是字符串，
 * 但是很多情况下我们也需要要传递复杂对象，比如用到表格的时候，当然也可以填json数据。
 * 网络传输的都是String，需要HttpConverter解析成我们要求的对象。
 */
@RestController
@RequestMapping("/collection")
@Api(description = "this test for list,map and other parameter")
public class RestParam {
    //
    @ApiOperation(value = "use list ", notes = "just a note,")
    @PostMapping("/string-list")
    public ResultFactory getStrings(@RequestParam("ls") List<String> ls){
        ResultFactory r = ResultFactory.ok();
        for (int i= 0;i<ls.size();i++){
            r.put(i+"",ls.get(i));
        }
        return r;
    }

    @ApiOperation(value = "this is for map", notes = "there is no notes")
    @PostMapping("/string-map")
    // requestBody的限制，只有一个。
    public ResultFactory getStringMap(@RequestBody Map<String, String> map){
        ResultFactory r = ResultFactory.ok();
        for(Map.Entry<String,String> entry:map.entrySet()){
            // r.put(entry.getKey(),entry.getKer()); 这就是不懂脑筋的表现，这样就会犯低级错误
            r.put(entry.getKey(),entry.getValue());
        }
        return r;

    }

    @ApiOperation(value = "this is for map", notes = "there is no notes")
    @PostMapping("/string-map-param")
    // requestBody的限制，只有一个。
    public ResultFactory getStringMapParam(@RequestParam Map<String, String> map){
        ResultFactory r = ResultFactory.ok();
        for(Map.Entry<String,String> entry:map.entrySet()){
            r.put(entry.getKey(),entry.getValue());
        }
        return r;

    }

    @ApiOperation(value = "this is for map", notes = "there is no notes")
    @PostMapping("/list-map")
    public ResultFactory getListAndMap(@RequestParam("map") Map<String, String> map, @RequestParam("ls")
    List<String> ls){
        ResultFactory r = ResultFactory.ok();

        for (int i= 0;i<ls.size();i++) {
            r.put(i + "", ls.get(i));
        }

        for(Map.Entry<String,String> entry:map.entrySet()){
            r.put(entry.getKey(),entry.getKey());
        }
        return ResultFactory.ok().put("name","liyong");

    }

    @ApiOperation(value = "for object ")
    @GetMapping("/simple")
    public SimpleEntity backEntity(){

        return new SimpleEntity(12,"43");
    }
    @ApiOperation(value = "for object1 ")
    @GetMapping("/simple1")
    public ResultFactory backEntity1(){

        return ResultFactory.ok().put("name","liyong");
    }
    @ApiOperation(value = "for object1 ")
    @GetMapping("/simple2")
    public Map<String,Object> backEntity2(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","liyong");
        return map;
    }
}
