package com.meituan.demo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/***
 * 添加的拦截器代码
 */
@Slf4j
public class CsrfInterceptor  implements HandlerInterceptor {


    /**
     * 默认白名单
     */
    private static final String[] WHITE_URLS ={"baidu.com","localhost.com"};

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String userAgent = request.getHeader("User-Agent");
        //此处仅处理referer
        String referer = request.getHeader("Referer");
        String url = request.getRequestURI();
//        log.info("preHandle request agent={}, referer={},URI={}",userAgent,referer,url);
        boolean contains = true ;
        if ( StringUtils.isNotBlank(referer) ){

            final String  host = referer.split("://")[1].split("/")[0];

            contains = Arrays.stream(WHITE_URLS).anyMatch(u -> u.contains(host));
        }

        return contains;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
