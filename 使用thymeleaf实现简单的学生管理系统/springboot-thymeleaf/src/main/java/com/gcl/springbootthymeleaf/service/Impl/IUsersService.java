package com.gcl.springbootthymeleaf.service.Impl;

import com.gcl.springbootthymeleaf.dao.UsersDao;
import com.gcl.springbootthymeleaf.entity.Users;
import com.gcl.springbootthymeleaf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUsersService implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> findAll() {
       return usersDao.findAll();
    }

    @Override
    public List<Users> findByUserName(String username) {
        return usersDao.findAllByUsername(username);
    }

    @Override
    public void save(Users user) {
        usersDao.save(user);
    }

    @Override
    public List<Users> findAllByUsernameAndPassword(String username, String password) {
        return usersDao.findAllByUsernameAndPassword(username,password);
    }
}
