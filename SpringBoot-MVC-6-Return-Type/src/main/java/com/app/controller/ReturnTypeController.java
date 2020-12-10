package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnTypeController {
	//new coding style
	@RequestMapping("/show")
	public String showNew(Model model,HttpServletRequest req)
	{
		String url=req.getRequestURL().toString();
		model.addAttribute("id", 110);
		model.addAttribute("name", "ram"+url);
		return "data";
	}
	
	//old coding style
     @RequestMapping("/old")
	public ModelAndView showOld()
	{
    	ModelAndView m=new ModelAndView();
    	m.setViewName("data");
    	m.addObject("sal", 5000);
		return m;
	}
     //legecy for ModelMap
     @RequestMapping("/showold")
 	public String showOld(ModelMap model)
 	{
 		model.addAttribute("data", "Old ModelMap data");
 		return "data";
 	}
	

}
