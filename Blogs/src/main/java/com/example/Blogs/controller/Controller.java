package com.example.Blogs.controller;

import com.example.Blogs.entity.Blog;
import com.example.Blogs.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/blog")
public class Controller {
    @Autowired
    private BlogService blogService;

    @PostMapping("/save")
    public void save(@RequestBody Blog blog){
        blogService.save(blog);
    }

    @GetMapping("/{id}")
    public Optional<Blog> findById(@PathVariable("id") Integer id){
        return blogService.findById(id);
    }

    @GetMapping("/")
    public List<Blog> findAll(){
        return blogService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        blogService.deleteById(id);
    }
}
