package com.example.springboot1.repositories;

import com.example.springboot1.models.Ad;
import com.example.springboot1.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OwnerRepository extends JpaRepository<Owner, Long> {
}