package com.iotknowyou.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @title: commonInterceptor
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  14:54
 * @description: 公共的拦截器
 */


/**
 *  定义一个公共的拦截器
 */
public class commonInterceptor extends HandlerInterceptorAdapter {

    /*

    多种拦截方式

    @Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// 执行完毕，返回前拦截
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// 在处理过程中，执行拦截
	}



    */







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


        System.out.println("进入了自定义的拦截器（ commonInterceptor ）");
        request.getRequestDispatcher("error").forward(request, response);

        return false;
    }


}
