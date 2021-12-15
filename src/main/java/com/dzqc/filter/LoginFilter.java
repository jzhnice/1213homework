package com.dzqc.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/14 9:15
 */
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
//        做用户登录过滤 登录 需要放行 注册需要放行   校验需要i放行  页面跳转放行
//        获取请求路径  判断uri是否包含关键字
        String uri = req.getRequestURI();
        if (uri.contains("/login")
        ||uri.contains("/statics/")
        ) {
            chain.doFilter(req, res);
            return;
        }
        HttpSession session = req.getSession();
        Object loginUser = session.getAttribute("devUserSession");
        if (loginUser != null) {
            chain.doFilter(req, res);
        } else {
            req.getRequestDispatcher("/page/login.to").forward(req, res);
        }
    }


}