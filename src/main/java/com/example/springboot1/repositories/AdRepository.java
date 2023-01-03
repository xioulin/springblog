package com.example.springboot1.repositories;

import com.example.springboot1.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdRepository extends JpaRepository<Ad, Long> {
    Ad findByTitle(String title);
    Ad findFirstByTitle(String title);
}