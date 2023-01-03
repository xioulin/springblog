package com.example.springboot1.controllers;

import com.example.springboot1.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {

    private final AdRepository adDao;

    public AdController(AdRepository adDao){
        this.adDao=adDao;
    }

    @GetMapping(name="/ads")
    public String index(Model model){
        model.addAttribute("ads",adDao.count());
        return "adCreate";
    }

}
