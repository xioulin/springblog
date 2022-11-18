package com.example.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {

    @GetMapping("/home")
    public String landingPage() {
        return "home";
    }
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return"hello";
    }


    @GetMapping("/dogpark/{dog}")
    public String dogpark(@PathVariable String dog, Model model) {
        model.addAttribute("dog1",dog);
        return "dogPark";
    }

}
