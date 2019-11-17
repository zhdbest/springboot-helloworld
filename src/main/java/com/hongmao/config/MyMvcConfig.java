package com.hongmao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/11/11 22:01
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 默认访问的首页是 login 页面
        registry.addViewController("").setViewName("login");
        registry.addViewController("index.html").setViewName("login");
    }
}
