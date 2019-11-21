package com.iotknowyou.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @title: commonFilter
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  16:04
 * @description: commonFilter
 */
public class commonFilter implements Filter{
    private static final Logger logger = Logger.getLogger(commonFilter.class);

    @Override
    public void destroy() {
        System.out.println("销毁过滤器方法");
        logger.info("销毁过滤器方法");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest  request=(HttpServletRequest) req;
        String servletPath = request.getServletPath();
        logger.info("请求路径过滤信息路径为：" + servletPath);

        //访问/view/viewpages时，才放过，

        /*
        *   实际的开发中 ，通过判断是否有 session 或者 权限是否允许 来判断是否 可以放行
        *
        * */
        if (servletPath.equals("/view/viewpages")  ) {
            chain.doFilter(req, res);
            return;
        }else {
            String contextPath=request.getContextPath();
            response.setCharacterEncoding("utf-8");
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            //否则拦截，跳转指定的页面
            pw.print("<script>window.top.location.href='"+contextPath + "/filter'"+";</script>");
        }

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("初始化过滤器的方法");
        logger.info("初始化过滤器的方法");
    }


}
