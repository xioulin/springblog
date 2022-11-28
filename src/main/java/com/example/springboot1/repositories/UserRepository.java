package com.example.springboot1.repositories;


import com.example.springboot1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}