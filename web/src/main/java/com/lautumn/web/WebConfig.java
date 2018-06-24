package com.lautumn.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author:Lautumn
 * @Date: Create in 下午6:19 2018/6/23
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:/Users/lautumn/JAVALEARN/web/upload/");
        registry.addResourceHandler("/**")
                .addResourceLocations("file:/Users/lautumn/JAVALEARN/web/src/main/resources/static/");
    }
}
