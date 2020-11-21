package com.gcl.springbootthymeleaf.dao;

import com.gcl.springbootthymeleaf.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersDao extends JpaRepository<Users,Integer>{
    List<Users> findAllByUsername(String username);
    List<Users> findAllByUsernameAndPassword(String username,String password);
}
