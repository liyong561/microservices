package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 最基本的就是crud,虽然是很基础的工作，但是要做到非常熟练
 */
@Mapper
public interface UserMapper {
    Boolean add(User user);
    Boolean delete(Integer id);
    Boolean update(User user);
    User selectById(Integer id);
    User selectByName(String name);
    // 模糊查询,多个参数时使用@Param注解
    List<User> selectLikeName(@Param("name") String name);

}
