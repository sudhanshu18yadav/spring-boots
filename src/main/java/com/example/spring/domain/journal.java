package com.example.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class journal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;

    journal(){}
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public journal(String name){
        this.name = name;
    }
}
