package com.example.chengduservice.mapper;

import com.example.chengduservice.entity.News;

import java.util.List;
import java.util.Map;

/**
 * create by yongli on 2020-04-16 21:1Ø7
 */

public interface NewsDAO {

    Integer batchInsertNews(List<News> newsList);

    Integer insertOneNews(News news);

    List<News> selectByKeyWord(String keyWord);

    // map就是真的又封装了一个map，那样的引用是有问题的。
    // List<News> batchSelect(@Param("map") Map<String, Object> map);
    List<News> batchSelect(Map<String, Object> map);
}
