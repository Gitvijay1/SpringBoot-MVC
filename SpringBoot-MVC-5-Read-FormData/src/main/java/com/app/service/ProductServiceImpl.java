package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProdutRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProdutRepository repo;

	@Override
	public Integer saveProduct(Product pod) {
           Integer id = repo.save(pod).getPid();
		return id;
	}

}
