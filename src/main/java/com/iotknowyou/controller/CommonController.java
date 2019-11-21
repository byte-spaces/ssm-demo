package com.iotknowyou.controller;

import com.iotknowyou.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: CommonController
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  15:02
 * @description: CommonController
 */

@Controller
public class CommonController {

    @RequestMapping("/error")
    @ResponseBody
    public String errInfo(){
        return "error: your quest is interceptor !";
    }

    @RequestMapping("/filter")
    @ResponseBody
    public String filterInfo(){
        return "error: your quest is filter !";
    }
}
