package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    boolean validate(String name,String pwd);
    Boolean add(User user);
    Boolean delete(Integer id);
    Boolean update(User user);
    User selectById(Integer id);
    User selectByName(String name);
    // 模糊查询
    List<User> selectLikeName(String name);

}
