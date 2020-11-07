package com.gcl.springbootthymeleaf.service;

import com.gcl.springbootthymeleaf.entity.Users;

import java.util.Collection;
import java.util.List;

public interface UsersService {
    List<Users> findAll();

    List<Users> findByUserName(String username);

    void save(Users user);

    List<Users> findAllByUsernameAndPassword(String username, String password);
}
