package com.wojia.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author 慕琪
 * @Date 2021/2/3 15:10
 * @Version 1.0
 **/
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("index.html");
    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
//        registry.addInterceptor(new MyIntercepter()).addPathPatterns("/**")
//                .excludePathPatterns("/","/login","/toLogin","/toRegist","/index","/toshopping_cart","member_regist.html");
//    }
}
