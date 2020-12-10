package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProdutRepository extends JpaRepository<Product, Integer> {

}
