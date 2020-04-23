package com.example.chengduservice.service;

import com.example.chengduservice.entity.News;
import java.util.Map;

import java.util.List;

/**
 * create by yongli on 2020-04-16 21:54
 */

public interface NewsService {

    Integer batchInsertNews(List<News> newsList);

    Integer insertOneNews(News news);

    List<News> selectByKeyWord(String keyWord);

    List<News> batchSelect(Map<String,Object> map);
}
