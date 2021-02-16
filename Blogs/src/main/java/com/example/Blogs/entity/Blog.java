package com.example.Blogs.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String title;
    private String body;
    private String author;

}
