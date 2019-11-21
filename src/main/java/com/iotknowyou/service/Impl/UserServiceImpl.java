package com.iotknowyou.service.Impl;

import com.iotknowyou.mapper.UserMapper;
import com.iotknowyou.model.User;
import com.iotknowyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title: UserServiceImpl
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  12:53
 * @description: UserServiceImpl
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getInfo() {
        return userMapper.getInfo();
    }

    @Override
    public List<User> getAllInfo() {
        return userMapper.getAllInfo();
    }
}
