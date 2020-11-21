package com.gcl.springbootthymeleaf.service;

import com.gcl.springbootthymeleaf.entity.Users;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UsersService {
    List<Users> findAll();

    List<Users> findByUserName(String username);

    void save(Users user);

    List<Users> findAllByUsernameAndPassword(String username, String password);

    Page<Users> getUsersList(int pageNum, int pageSize);
}
