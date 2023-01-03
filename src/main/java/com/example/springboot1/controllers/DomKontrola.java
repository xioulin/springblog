package com.example.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DomKontrola {

    @GetMapping("/domow")
    public String dom(){
        return "domowa";
    }
}
