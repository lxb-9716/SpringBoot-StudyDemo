package com.it.springboot.service;

import com.it.springboot.dao.jpa.UserRepository;
import com.it.springboot.dao.mybatisMapper.UserMapper;
import com.it.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public void insert(User user) {
        /*   userRepository.insertUser(user);*/
        userRepository.save(user);
    }

    public List<User> findUserByUsername(String username) {
        /*   userRepository.insertUser(user);*/
        return userMapper.selectUserByName(username);
    }

    public List<User> selectAll() {
        /*   userRepository.insertUser(user);*/
        return userRepository.findAll();
    }
}
