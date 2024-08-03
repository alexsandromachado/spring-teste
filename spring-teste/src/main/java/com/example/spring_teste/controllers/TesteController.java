package com.example.spring_teste.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteController {
	
    private static final Logger log = LoggerFactory.getLogger(TesteController.class);
	
	@GetMapping
	public String status() {
		log.info("testando logs!!");
		return "Spring is running!!";
	}
	
	@GetMapping("/check")
	public String check() {
		return """ 
	{
        "superhero":"Spider Man", 
        "publisher":"Marvel Comics", 
        "alter_ego":"Peter Parker",
        "first_appearance":"Amazing Fantasy #15",
        "characters":"Peter Parker"
    }
    """;
	}

}
