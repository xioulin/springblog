package com.example.springboot1.controllers;

import com.example.springboot1.models.Post;
import com.example.springboot1.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping(path="/posts")
    @ResponseBody
    public String homePage(){
        return "welcome home";
    }

//    @GetMapping(path="/posts/{id}")
//    public String singlePost(PathVariable long id, Model model){
//        Post singlePost = new Post(id,"first post", "what what")
//        model.setAttribute("post",singlePost)
//        return "posts/show";
//    }


    @RequestMapping(method= RequestMethod.GET, path="/posts/create")
    @ResponseBody
    public String createForm(){
        return "thisis your id ";
    }

    @RequestMapping(method= RequestMethod.POST, path="/posts/create")
    @ResponseBody
    public String submitForm(@RequestParam(name="title") String title ,@RequestParam(name="description") String description, Model model){
        Post post = new Post();
        post.setTitle(title);
        post.setBody(description);
        postDao.save(post);
        return "";
    }


}

