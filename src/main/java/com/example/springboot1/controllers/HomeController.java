package com.example.springboot1.controllers;

import com.example.springboot1.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    private final AdRepository adDao;

    public HomeController(AdRepository adDao){
        this.adDao = adDao;
    }


    @GetMapping("/")
    @ResponseBody
    public String landingPage() {
        return "home";
    }


    @GetMapping("/dogpark")
    public String dogpark(Model model) {
        List<String> dogs = new ArrayList<>();
        dogs.add("Rufus");
        dogs.add("Fido");
        dogs.add("Fifi");

        model.addAttribute("dogs", dogs);
        return "dogPark";
    }

    @GetMapping("/catpark")
    public String catPark(Model model){
        List<String> cats = new ArrayList<>();
        cats.add("Fido");
        cats.add("Fifi");
        cats.add("Rover");


        model.addAttribute("cats",cats);
        return "catpark";
    }




    @GetMapping("/ads")
    public String Ad(){
        return "string";
    }


}
