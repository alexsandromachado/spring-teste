package com.example.spring_teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_teste.dto.ProductRequestDTO;
import com.example.spring_teste.dto.ProductResponseDTO;
import com.example.spring_teste.entities.Product;
import com.example.spring_teste.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public ProductResponseDTO save(ProductRequestDTO body) {
		Product newProduct = new Product(body);
		newProduct = repository.save(newProduct);
		return new ProductResponseDTO(newProduct);
	}

	public List<ProductResponseDTO> findAll() {
		var products = repository.findAll().stream().map(ProductResponseDTO::new).toList();
		return products;
	}

}
