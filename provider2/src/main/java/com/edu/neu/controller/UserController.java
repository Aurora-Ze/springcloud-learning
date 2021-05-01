package com.edu.neu.controller;

import com.edu.neu.entity.User;
import com.edu.neu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Aurora
 * @Title: UserController
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/14 23:10
 */

@RestController()
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/findById/{id}")
    public User findUserById(@PathVariable("id") int id){
        return userService.findById(id);
    }
}
