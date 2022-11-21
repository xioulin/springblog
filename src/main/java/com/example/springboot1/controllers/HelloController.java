package com.example.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {



    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }


    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return"hello";
    }


    @PostMapping("/join")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, @RequestParam(name="color") String color, Model model) {
        model.addAttribute("color",color);
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }
}
