package com.example.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring.domain.journal;
import com.example.spring.repository.journalRepository;

@SpringBootApplication
public class JournalApplication {
	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}

	@Bean
	InitializingBean saveData(journalRepository repo){
		return ()->{
			repo.save(new journal("name-1"));
			repo.save(new journal("name-2"));
			repo.save(new journal("name-3"));
		};
	}
}
