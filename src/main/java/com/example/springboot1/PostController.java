package com.example.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {


    @RequestMapping(method= RequestMethod.GET, path="/posts")
    @ResponseBody
    public String homePage(){
        return "welcome home";
    }

    @RequestMapping(method= RequestMethod.GET, path="/posts/{id}")
    @ResponseBody
    public String postID(@PathVariable int id){
        return "thisis your id "+id;
    }


    @RequestMapping(method= RequestMethod.GET, path="/posts/create")
    @ResponseBody
    public String getId(@PathVariable String post){
        return "thisis your id "+post;
    }

    @RequestMapping(method= RequestMethod.POST, path="/posts/create")
    @ResponseBody
    public String postId(@PathVariable String post1){
        return "thisis your id "+post1;
    }


}

