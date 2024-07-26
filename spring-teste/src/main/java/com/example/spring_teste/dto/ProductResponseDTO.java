package com.example.spring_teste.dto;

import com.example.spring_teste.entities.Product;

public record ProductResponseDTO(Long id, String name, Integer price) {
	public ProductResponseDTO(Product product) {
		this(product.getId(), product.getName(), product.getPrice());
	}
}
