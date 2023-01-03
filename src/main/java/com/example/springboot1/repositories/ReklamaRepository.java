package com.example.springboot1.repositories;

import com.example.springboot1.models.Reklama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReklamaRepository extends JpaRepository<Reklama, Long> {
}
