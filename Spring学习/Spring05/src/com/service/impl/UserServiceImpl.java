package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "userService")
@Scope(value = "prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier(value = "userDao1")
    private UserDao userDao;

    public UserServiceImpl(){
        System.out.println("对象创建了");
    }

    //@PostConstruct
    public void  init(){
        System.out.println("初始化方法执行了");
    }

    //@PreDestroy
    public void  destroy(){
        System.out.println("销毁方法执行了");
    }

    @Override
    public void save() {
        userDao.save();
    }
}
