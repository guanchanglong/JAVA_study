package com.ui;

import com.dao.UserDao;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    @Test
    public void demo4(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userService",UserService.class);
        System.out.println(userService);
        applicationContext.close();
    }

    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = applicationContext.getBean("userService",UserService.class);
        UserService userService2 = applicationContext.getBean("userService",UserService.class);
        System.out.println(userService1==userService2);
    }

    @Test
    public void demo2(){
        //1.获取核心容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据id获取Bean对象
        UserService userService  = applicationContext.getBean("userService",UserService.class);
        userService.save();
    }

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        userDao.save();
    }
}
