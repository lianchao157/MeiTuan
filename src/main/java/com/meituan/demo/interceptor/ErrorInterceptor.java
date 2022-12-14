package com.meituan.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        int status = httpServletResponse.getStatus();
//        log.info("uri={},status={}",uri,status);

        switch (status){
            case 500:
                modelAndView.setViewName("500");
                break;
            case 400:
                modelAndView.setViewName("400");
                break;
            case 404:
                modelAndView.setViewName("404");
                break;
            case 302:
                modelAndView.setViewName("302");
                break;
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
