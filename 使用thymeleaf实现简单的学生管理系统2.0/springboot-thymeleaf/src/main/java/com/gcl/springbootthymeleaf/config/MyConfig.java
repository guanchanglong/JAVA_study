package com.gcl.springbootthymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截的请求，并排除几个不拦截的请求
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/users/login","/users/userLogin","/users/register","/users/userRegister");
    }
}
