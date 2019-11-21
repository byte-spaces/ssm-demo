package com.iotknowyou.controller;

import com.iotknowyou.model.User;
import com.iotknowyou.service.UserService;
import com.sun.tools.jdi.PrimitiveValueImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

import java.util.List;

/**
 * @title: UserController
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  12:50
 * @description: UserController
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public User getInfo(){
        System.out.println("查询数据库得到数据："+userService.getInfo());
        return userService.getInfo();
    }



    @RequestMapping("/AllUser")
    @ResponseBody
    public List<User> getAllInfo(){
        System.out.println("查询数据库得到数据："+userService.getInfo());
        return userService.getAllInfo();
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "Hello world !!  Login Successful !";
    }


    @RequestMapping("/toLogin")
    @ResponseBody
    public String loginInterceptor(){
        return "Hello world !!  Login Successful !";
    }

    @RequestMapping("/view/viewpages")
    @ResponseBody
    public String show(){
        return "Hello world !!  show  viewpages !";
    }

}
