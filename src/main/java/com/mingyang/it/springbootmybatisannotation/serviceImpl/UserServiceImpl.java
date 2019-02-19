package com.mingyang.it.springbootmybatisannotation.serviceImpl;

import com.mingyang.it.springbootmybatisannotation.entity.User;
import com.mingyang.it.springbootmybatisannotation.mappers.UserMapper;
import com.mingyang.it.springbootmybatisannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "UserCache",key = "'user.getAllUsers'")
    public List<User> getAllUsers() {
        List<User> resultList = userMapper.getAllUsers();
        return resultList;
    }

    @Override
    @CacheEvict(value = "UserCache",key = "'user.getAllUsers'")
    public void deleteUser(Integer id) {
        userMapper.delete(id);

    }
}
