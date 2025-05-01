package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.domain.journal;

public interface journalRepository extends JpaRepository<journal, Integer> {
    
}
