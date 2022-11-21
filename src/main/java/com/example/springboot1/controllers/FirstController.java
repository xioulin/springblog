package com.example.springboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {



        @GetMapping("/test")
        @ResponseBody
        public String test() {
            return "Hello from Spring!";
    }

    @RequestMapping(method = RequestMethod.GET, path="/bubbles")
    @ResponseBody
    public String bubbles(){
            return "kitties";
    }

    @GetMapping("/greeting/{name}/{lastname}")
    @ResponseBody
    public String greeting(@PathVariable String name, @PathVariable String lastname){
            return "Greetings human, "+name+lastname;
    }

}
