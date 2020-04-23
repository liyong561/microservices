package com.example.chengduservice.service.impl;

import com.example.chengduservice.entity.News;
import com.example.chengduservice.mapper.NewsDAO;
import com.example.chengduservice.service.NewsService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by yongli on 2020-04-16 21:55
 */

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDAO newsDAO;


    @Override
    public Integer batchInsertNews(List<News> newsList) {
        return newsDAO.batchInsertNews(newsList);
    }

    @Override
    public Integer insertOneNews(News news) {
        return newsDAO.insertOneNews(news);
    }

    @Override
    public List<News> selectByKeyWord(String keyWord) {
        return newsDAO.selectByKeyWord(keyWord);
    }

    @Override
    public List<News> batchSelect(Map<String, Object> map) {
        return newsDAO.batchSelect(map);
    }
}
