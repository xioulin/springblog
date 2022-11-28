package com.example.springboot1.controllers;

import com.example.springboot1.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;

public class AuthController {

    private UserRepository userDao;
    public AuthController(UserRepository userDao){
        this.userDao = userDao;
    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "users/login";
    }
}
