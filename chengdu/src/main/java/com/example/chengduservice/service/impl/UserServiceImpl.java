package com.example.chengduservice.service.impl;

import com.example.chengduservice.entity.User;
import com.example.chengduservice.mapper.UserDAO;
import com.example.chengduservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by yongli on 2019-09-22 16:12
 * 来点较为复杂的业务。
 * 因为没有涉及到外部系统的对接，所以这样吗？
 * 没有类别是吗？
 * 多写几个if,switch复杂度是否不是就上去了？
 * 还是有很多方法的调用 ？
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public void insert(User user) {
        userDAO.insert(user);
    }

    @Override
    public void batchInsert(List<User> users) {
        userDAO.batchInsert(users);
    }

    @Override
    public User selectUserById(String userId) {
        return userDAO.selectUserById(userId);
    }

    @Override
    public List<User> selectUsers(Integer from, Integer limit) {
        return userDAO.selectUsers(from, limit);
    }

    @Override
    public Integer selectCount() {
        return userDAO.selectCount();
    }


}
