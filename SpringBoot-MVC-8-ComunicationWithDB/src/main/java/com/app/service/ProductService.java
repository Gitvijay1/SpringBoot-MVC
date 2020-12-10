package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductService {
	//save data
	public Integer saveProduct(Product prod);
	
	//fatch all data
	public List<Product> getAllProd();

}
