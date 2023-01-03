package com.example.springboot1.controllers;

import com.example.springboot1.models.Reklama;
import com.example.springboot1.repositories.ReklamaRepository;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Controller
public class ReklamaKontrola {



    private final ReklamaRepository reklamaDao;
    public ReklamaKontrola(ReklamaRepository reklamaDao){
        this.reklamaDao = reklamaDao;
    }

    @GetMapping("/reklamy")
    public String indexy(Model model1){
        model1.addAttribute("reklamy",reklamaDao.findAll());
        return "reklamy";
    }


}
