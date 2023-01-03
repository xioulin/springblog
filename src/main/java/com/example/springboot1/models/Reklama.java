package com.example.springboot1.models;


import javax.persistence.*;

@Entity
@Table(name="reklamy")
public class Reklama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false)
    public String tytul;
    @Column(nullable = false, length=230)
    public String okreslenie;

}
