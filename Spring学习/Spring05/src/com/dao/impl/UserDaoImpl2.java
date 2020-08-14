package com.dao.impl;

import com.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao2")
public class UserDaoImpl2 implements UserDao {

    @Override
    public void save() {
        System.out.println("保存数据222");
    }
}
