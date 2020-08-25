package com;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(path = "/hello")   //请求映射注解
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
