package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao1")
public class UserDaoImpl implements UserDao {
    @Override
    public void save(){
        System.out.println("保存数据111");
    }
}
