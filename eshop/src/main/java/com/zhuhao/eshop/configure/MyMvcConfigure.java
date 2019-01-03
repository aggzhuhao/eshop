package com.zhuhao.eshop.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 定义视图解析，用于解析无需任何数据交互的，直接到页面
 */
@Configuration  //表示这是一个配置类
public class MyMvcConfigure implements WebMvcConfigurer {
    /*
     * 添加视图解析器
     */
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/article").setViewName("article");
        registry.addViewController("/cart").setViewName("cart");

        registry.addViewController("/checkbuy").setViewName("checkbuy");
        registry.addViewController("/detail").setViewName("detail");
        registry.addViewController("/discount").setViewName("discount");

        //registry.addViewController("/index").setViewName("index");
        //registry.addViewController("/").setViewName("index");
        registry.addViewController("/lists").setViewName("lists");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/orderlist").setViewName("orderlist");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/shownew").setViewName("shownew");
        registry.addViewController("/usercenter").setViewName("usercenter");
    }
}
