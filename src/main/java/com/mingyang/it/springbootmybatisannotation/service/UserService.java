package com.mingyang.it.springbootmybatisannotation.service;

import com.mingyang.it.springbootmybatisannotation.entity.User;

import java.util.List;

public interface UserService {

    //查询所以的用户
    List<User> getAllUsers();

    //删除指定id的用户信息
    void deleteUser(Integer id);

}
