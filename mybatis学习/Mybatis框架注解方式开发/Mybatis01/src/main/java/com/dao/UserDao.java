package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    /**
     * 查询全部操作
     * @return
     */
    @Select("select * from product")
    List<User>findAll();
}
