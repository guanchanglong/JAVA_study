package com.gcl.springbootthymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截的请求，并排除几个不拦截的请求
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/users/login","/users/userLogin","/users/register","/users/userRegister","/defaultKaptcha","/static/**");
    }

//    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//            "classpath:/META-INF/resources/", "classpath:/resources/",
//            "classpath:/static/", "classpath:/public/" };


//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        /*
//         * addResourceHandler是访问路径前缀，参数可设置多个，以逗号分隔，例：/image/**,/css/**
//         * addResourceLocations是对应的资源路径，也可以设置多个。
//         */
//        //registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
////        if (!registry.hasMappingForPattern("/webjars/**")) {
////            registry.addResourceHandler("/webjars/**").addResourceLocations(
////                    "classpath:/META-INF/resources/webjars/");
////        }
////        if (!registry.hasMappingForPattern("/**")) {
////            registry.addResourceHandler("/**").addResourceLocations(
////                    CLASSPATH_RESOURCE_LOCATIONS);
////        }
//    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
