package com.jerald.securityapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
public  String greet(HttpServletRequest request){

        return "Welcome to Spring Security"+ request.getSession().getId();

    }
}
