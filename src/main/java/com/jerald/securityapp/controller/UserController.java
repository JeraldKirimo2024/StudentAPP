package com.jerald.securityapp.controller;

import com.jerald.securityapp.model.Users;
import com.jerald.securityapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public Users users(@RequestBody Users user){
        return userService.register(user);
    }
}
