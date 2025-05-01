package com.example.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring.domain.journal;
import com.example.spring.repository.journalRepository;

@Controller
public class JournalController {

    @Autowired
    journalRepository repo;

    @RequestMapping("/")
    public List<journal> hello() {
        return repo.findAll();
    }

    // this is to aded to ammend
    @RequestMapping(value ="/journal", produces ={MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody List<journal> getAll(){
        return repo.findAll();
    }
}
