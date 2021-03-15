package com.it.springboot.controller;

import com.it.springboot.pojo.User;
import com.it.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/insert")
    public void insert(User user) {
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("张三");
        user1.setAge(23);
        user1.setCreateTime(new Date());
        userService.insert(user1);
    }

    @GetMapping("/selectAll")
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @GetMapping("/findUserByUsername-mapper/{username}")
    public List<User> findUserByUsername(@PathVariable("username") String username) {
        /*   userRepository.insertUser(user);*/
        return userService.findUserByUsername(username);
    }
}
