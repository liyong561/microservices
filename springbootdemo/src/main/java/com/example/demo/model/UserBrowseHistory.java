package com.example.demo.model;

/**
 * 所有用户的浏览的历史，用于向用户推荐。这是一个记录关系的表，
 * 显然这样的记录会非常多，插入操作会非常频繁。
 *
 *
 */
public class UserBrowseHistory {
    Integer hId;
    Integer userId;
    Integer producdId;
}
