package com.gcl.springbootthymeleaf.dao;

import com.gcl.springbootthymeleaf.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentsDao extends JpaRepository<Students, Integer> {
    List<Students> findAllByNumber(String number);

    void deleteByNumber(String number);
}
