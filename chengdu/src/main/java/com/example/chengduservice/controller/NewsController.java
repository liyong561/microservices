package com.example.chengduservice.controller;

import com.example.chengduservice.entity.News;
import com.example.chengduservice.service.NewsService;
import com.example.chengduservice.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by yongli on 2020-04-16 21:57
 * 真正这么模块化的服务很好，大部分实体类都是关联很多，盘根错节
 */
@RestController
@Api("news controller")
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @PostMapping("/batchInsert")
    @ApiOperation("批量插入新闻")
    public CommonResult batchInsertNews(@RequestBody List<News> newsList) {

        if (newsList.isEmpty()) {
            return CommonResult.success("0"); // 没有新闻插入
        }
        return CommonResult.success(newsService.batchInsertNews(newsList));
    }

    @GetMapping("/queryByKeyWord")
    @ApiOperation("")
    public CommonResult queryByKeyWord(@RequestParam("keyWord") String keyWord) {
        return CommonResult.success(newsService.selectByKeyWord(keyWord));
    }

    @GetMapping("/queryByCondition")
    @ApiOperation("keyWord,item1 查询操作")
    public CommonResult queryByCondition(@RequestParam("keyWord") String keyWord,
                                         @RequestParam("item1") String item1) {
        Map<String,String> map = new HashMap<>();
        map.put("keyWord",keyWord);
        map.put("item1",item1);
        return CommonResult.success(newsService.batchSelect(map));
    }

    @PostMapping("/insertOne")
    @ApiOperation("批量插入新闻")
    public CommonResult batchInsertNews(@RequestBody News news) {
        return CommonResult.success(newsService.insertOneNews(news));
    }

    @GetMapping("/queryTest")
    @ApiOperation("测试map的查询操作")
    public CommonResult batchSelectQuery(){
        Map<String,String> map = new HashMap<>();
        map.put("keyWord","abstract");
        map.put("item1","dsdzfs");
        return CommonResult.success(newsService.batchSelect(map));
    }

}
