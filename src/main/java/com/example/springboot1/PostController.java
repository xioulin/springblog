package com.example.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


    @GetMapping(path="/posts")
    @ResponseBody
    public String homePage(){
        return "welcome home";
    }

    @GetMapping(path="/posts/{id}")
    @ResponseBody
    public String singlePost(@PathVariable long id){
        return "thisis your id "+id;
    }


    @RequestMapping(method= RequestMethod.GET, path="/posts/create")
    @ResponseBody
    public String createForm(){
        return "thisis your id ";
    }

    @RequestMapping(method= RequestMethod.POST, path="/posts/create")
    @ResponseBody
    public String postForm(){
        return "thisis your id ";
    }


}

