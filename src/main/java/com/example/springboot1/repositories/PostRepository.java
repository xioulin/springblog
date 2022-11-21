package com.example.springboot1.repositories;

import com.example.springboot1.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {



}