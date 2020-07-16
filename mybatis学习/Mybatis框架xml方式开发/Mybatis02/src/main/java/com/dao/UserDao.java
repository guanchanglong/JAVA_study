package com.dao;

import com.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 普通查询操作
     * @return
     */
    List<User>findAll();
    /**
     * 增添操作
     * @param user
     */
    void addUser(User user);

    /**
     * 根据产品类型删除
     * @param type
     */
    void deleteUserByType(String type);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 模糊查询操作
     * @return
     */
    List<User>findByType(String user);
}
