package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Product;
import com.app.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@RequestMapping("/reg")
	public String registerPage()
	{
		return "register";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String showData(
			@ModelAttribute Product product,
			Model model
			)
	{
		Integer id = service.saveProduct(product);
		String msg="data save succesfully";
		model.addAttribute("massage", msg);
		return "register";
	}

}
