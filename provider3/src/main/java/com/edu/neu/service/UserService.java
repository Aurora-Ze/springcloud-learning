package com.edu.neu.service;

import com.edu.neu.entity.User;
import com.edu.neu.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Aurora
 * @Title: UserService
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/17 16:38
 */
@Service
public class UserService {
    private UserMapper mapper;

    public List<User> findAll() {
        return mapper.selectList(null);
    }
    public User findById(int id) {
        return mapper.selectById(id);
    }
}
