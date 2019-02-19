package com.mingyang.it.springbootmybatisannotation.controller;

import com.mingyang.it.springbootmybatisannotation.entity.User;
import com.mingyang.it.springbootmybatisannotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> getAllUsers(){
        List<User> resultList = userService.getAllUsers();
        return resultList;
    }

    @RequestMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
