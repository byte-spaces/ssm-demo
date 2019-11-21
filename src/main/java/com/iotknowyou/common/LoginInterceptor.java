package com.iotknowyou.common;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @title: LoginInterceptor
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  15:34
 * @description: LoginInterceptor
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
/*
        拦截请求判断 是否 session
        String name =  (String) request.getSession().getAttribute("usersession");
            if(name == null || name==""){
                //request.getRequestDispatcher("loginPage.action").include(request, response);
                request.getRequestDispatcher("loginPage.action").forward(request, response);
                return false;
            }else
                return true;
             }
*/


        System.out.println("进入了自定义的拦截器（ LoginInterceptor ）");
        request.getRequestDispatcher("login").forward(request, response);

        /*
            false 表示不放行 ，
            true  放行
        */
        return false;
    }
}
