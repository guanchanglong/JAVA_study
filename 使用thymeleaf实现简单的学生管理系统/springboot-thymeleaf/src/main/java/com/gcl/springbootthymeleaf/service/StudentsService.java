package com.gcl.springbootthymeleaf.service;

import com.gcl.springbootthymeleaf.entity.Students;

import java.util.List;

public interface StudentsService {
    List<Students> findAll();

    List<Students> findAllByNumber(String number);

    void save(Students students);

    void deleteByNumber(String number);
}
