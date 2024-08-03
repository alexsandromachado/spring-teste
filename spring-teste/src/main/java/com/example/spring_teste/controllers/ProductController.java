package com.example.spring_teste.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.spring_teste.dto.ProductRequestDTO;
import com.example.spring_teste.dto.ProductResponseDTO;
import com.example.spring_teste.services.ProductService;

import jakarta.validation.Valid;

@RestController()
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping
	public ResponseEntity<ProductResponseDTO> postProduct(@RequestBody @Valid ProductRequestDTO body) {
		var newProduct = service.save(body);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newProduct.id())
				.toUri();
		return ResponseEntity.created(uri).body(newProduct);
	}

	@GetMapping
	public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
		List<ProductResponseDTO> productList = service.findAll();
		return ResponseEntity.ok(productList);
	}
}
