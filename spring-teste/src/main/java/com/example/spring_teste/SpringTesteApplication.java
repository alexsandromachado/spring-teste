package com.example.spring_teste;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTesteApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("running");
		
	}

}
