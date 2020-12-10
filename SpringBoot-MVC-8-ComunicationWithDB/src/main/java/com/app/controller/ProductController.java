package com.app.controller;

import java.util.List;

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
	public String showRegPage()
	{
		return "register";
	}
	
	//read form data and save to db
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	
	//read UI data
	public String dataPage(@ModelAttribute Product product,Model model)
	{
		//send data to ui
		Integer pid = service.saveProduct(product);
		//write massage
		String msg=pid+" sata save succesfully";
		model.addAttribute("obj", msg);
		return "register";
	}
	//fatch all record
	@RequestMapping("/all")
	public String getAll(Model model)
	{
		List<Product> list = service.getAllProd();
		model.addAttribute("data", list);
		return "show";
	}

}
