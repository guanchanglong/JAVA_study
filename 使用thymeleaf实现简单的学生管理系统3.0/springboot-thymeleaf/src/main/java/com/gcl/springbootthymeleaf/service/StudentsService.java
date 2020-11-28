package com.gcl.springbootthymeleaf.service;

import com.gcl.springbootthymeleaf.entity.Students;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentsService {
    List<Students> findAll();

    List<Students> findAllByNumber(String number);

    void save(Students students);

    void deleteByNumber(String number);

    Page<Students> getStudentsList(int pageNum, int pageSize);
}
