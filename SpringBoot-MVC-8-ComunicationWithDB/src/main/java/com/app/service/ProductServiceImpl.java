package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	public Integer saveProduct(Product product) {
		//calculation
		Double cost=product.getCost();
		Double dcount=cost * 5/100.0;
		Double gst=cost * 12/100.0;
		//set data to product
		product.setPDiscount(dcount);
		product.setPGst(gst);
         Integer id = repo.save(product).getPid();
		return id;
	}

	@Override
	public List<Product> getAllProd() {
        List<Product> list = repo.findAll();
		return list;
	}

}
