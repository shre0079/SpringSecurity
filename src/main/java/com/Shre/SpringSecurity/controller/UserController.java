package com.Shre.SpringSecurity.controller;

import com.Shre.SpringSecurity.model.User;
import com.Shre.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    private User register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
