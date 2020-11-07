package com.gcl.springbootthymeleaf.service.Impl;

import com.gcl.springbootthymeleaf.dao.StudentsDao;
import com.gcl.springbootthymeleaf.entity.Students;
import com.gcl.springbootthymeleaf.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentsService implements StudentsService {

    @Autowired
    private StudentsDao studentsDao;

    @Override
    public List<Students> findAll() {
        return studentsDao.findAll();
    }

    @Override
    public List<Students> findAllByNumber(String number) {
        return studentsDao.findAllByNumber(number);
    }

    @Override
    public void save(Students students) {
        studentsDao.save(students);
    }

    @Override
    public void deleteByNumber(String number) {
        studentsDao.deleteByNumber(number);
    }
}
