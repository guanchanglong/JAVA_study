package com.gcl.springbootthymeleaf.service.Impl;

import com.gcl.springbootthymeleaf.dao.StudentsDao;
import com.gcl.springbootthymeleaf.entity.Students;
import com.gcl.springbootthymeleaf.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @Override
    public Page<Students> getStudentsList(int pageNum, int pageSize) {
        Sort.Order sort = new Sort.Order(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, Sort.by(sort));
        return studentsDao.findAll(pageable);
    }
}
