package com.itheima.dao;

import com.itheima.pojo.User;

public interface UserDao {

    void insert(User User);

    User findUserById(Integer id);
}
