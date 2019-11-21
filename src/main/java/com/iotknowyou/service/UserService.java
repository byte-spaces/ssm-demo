package com.iotknowyou.service;

import com.iotknowyou.model.User;

import java.util.List;

/**
 * @title: UserService
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  12:52
 * @description: TODO
 */
public interface UserService {

    /*
     获取一个用户的信息
     */
    User getInfo();

    /*
    获取所有的用户信息
    */
    List<User> getAllInfo();
}
