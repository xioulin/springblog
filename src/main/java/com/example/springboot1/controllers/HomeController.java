package com.example.springboot1.controllers;


import com.example.springboot1.models.Ad;
import com.example.springboot1.repositories.AdRepository;
import com.example.springboot1.repositories.OwnerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.springboot1.services.AdService;
import com.example.springboot1.services.EmailService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    // Establish adsDao instance property
    private final AdRepository adsDao;
    private final OwnerRepository ownerDao;

    private final EmailService emailService;

//@Autowired
    private final AdService adService;
    // Anytime this controller is used, inject the adsDao so we can use it!
    public HomeController(AdRepository adsDao, OwnerRepository ownerDao, EmailService emailService, AdService adService) {
        this.adsDao = adsDao;
        this.ownerDao = ownerDao;
        this.emailService = emailService;
        this.adService = adService;
    }

    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return "This is the landing page!";
    }

    @GetMapping("/dogpark")
    public String dogpark(Model model) {
        List<String> dogs = new ArrayList<>();
        dogs.add("Bubbles");
        dogs.add("Spot");
        dogs.add("Ezekial");
        model.addAttribute("dogs", dogs);
        return "dogPark";
    }
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    @GetMapping("/ads")
    public String allAds(Model model) {
        List<Ad> ads = adService.getAds();
        // Other methods to note:
        // .save() - insert new record, or update a record.
        // .delete() - delete a record
        // .findById() - find record by id
        model.addAttribute("ads", ads);
        return "ads";

    }
    @GetMapping("/home")
    public String welcomeHome(Model model){
        model.addAttribute("name",model);
        return "home";
    }
    @GetMapping("/ads/create")
    public String showCreateForm(Model model) {
        model.addAttribute("ad", new Ad());
        return "adCreate";
    }
    @PostMapping("/ads/create")
    public String create(@ModelAttribute Ad ad){
        adService.createAd(ad);
        return "redirect:/ads";
    }
}