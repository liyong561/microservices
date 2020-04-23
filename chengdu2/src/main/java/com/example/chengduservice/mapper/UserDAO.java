package com.example.chengduservice.mapper;

import com.example.chengduservice.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create by yongli on 2019-09-23 20:54
 */

public interface UserDAO {

    void insert(User user);

    // 批量接口
    void batchInsert(List<User> users);

    // 用select可能要好些，这样和sql语句很一致了
    User selectUserById(String userId);

    // 分页查询，不用@Param参数
    List<User> selectUsers(Integer from, Integer limit);

    Integer selectCount();
}
