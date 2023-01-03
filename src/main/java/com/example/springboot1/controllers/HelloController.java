package com.example.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.io.Writer;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello from space!";
    }
    @GetMapping("/greet/{name}")
    @ResponseBody
    public String greetName(@PathVariable String name){
        return "greetings from space!"+name;
    }

    @GetMapping("/hello/{firstName}/{lastName}")
    public String sayHello(@PathVariable String firstName, @PathVariable String lastName, Model model) {
        model.addAttribute("imie", firstName);
        model.addAttribute("nazwisko",lastName);
        return "hello";
    }
    @RequestMapping(path = "/addOne/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }



}