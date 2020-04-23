package com.example.chengduservice.service;

import com.example.chengduservice.entity.User;

import java.util.List;

/**
 * create by yongli on 2019-09-22 16:13
 */

public interface UserService {
    void insert(User user);

    // 批量接口
    void batchInsert(List<User> users);

    // 用select可能要好些，这样和sql语句很一致了
    User selectUserById(String userId);

    // 分页查询
    List<User> selectUsers(Integer from, Integer limit);

    Integer selectCount();

}
