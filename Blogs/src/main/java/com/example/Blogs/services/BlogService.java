package com.example.Blogs.services;

import com.example.Blogs.entity.Blog;
import com.example.Blogs.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public void deleteById(Integer id) {
        blogRepository.deleteById(id);
    }

    public Optional<Blog> findById(Integer id) {
        return blogRepository.findById(id);
    }
}
