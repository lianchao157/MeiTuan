package com.meituan.demo.config;

import com.meituan.demo.interceptor.CsrfInterceptor;
import com.meituan.demo.interceptor.ErrorInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/****
 * 拦截器
 */
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    /**
     * 拦截白名单
     */
    private static final String[] EXCLUDE_PATH={"/swagger-ui.html","/swagger-resources/**","/v2/api-docs"};

    /**
     * CSRF拦截
     * @return
     */
    @Bean
    CsrfInterceptor csrfInterceptor(){
        return new CsrfInterceptor();
    }
    /**
     * 错误拦截
     * @return
     */
    @Bean
    ErrorInterceptor errorInterceptor(){
        return new ErrorInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(csrfInterceptor()).addPathPatterns("/**").excludePathPatterns(EXCLUDE_PATH);

        registry.addInterceptor(errorInterceptor()).addPathPatterns("/**").excludePathPatterns(EXCLUDE_PATH);
        super.addInterceptors(registry);
    }
}
