package com.example.spring_teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
