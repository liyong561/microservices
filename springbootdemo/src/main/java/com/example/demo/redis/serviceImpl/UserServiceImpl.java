package com.example.demo.redis.serviceImpl;

import com.example.demo.model.User;
import com.example.demo.redis.UserService;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean validate(String name, String pwd) {
       // 负责处理用户的验证问题。
        return true;
    }

    @Override
    public Boolean add(User user) {
        return userMapper.add(user);
    }

    @Override
    public Boolean delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public Boolean update(User user) {
        return userMapper.update(user);
    }

    @Override
    // 这是一个机遇切面的缓存
    @Cacheable("usersCache")
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public List<User> selectLikeName(String name) {
        return selectLikeName(name);
    }
}
