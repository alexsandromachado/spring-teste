package com.example.spring_teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteController {
	
	@GetMapping
	public String status() {
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
