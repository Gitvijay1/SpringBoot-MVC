package com.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Employee;

@Controller
public class DataController {
	@RequestMapping("/data")
	public String dhowData(
			Model model
			)
	{
		model.addAttribute("id",101);
		model.addAttribute("name","raja");

		return "home";
	}
	
	@RequestMapping("/emp")
	public String empData(
			Model model
			)
	{
		Employee e=new Employee(101,"rukhi","google",567.0);
		Employee e1=new Employee(102,"janu","vivo",736.0);
		Employee e2=new Employee(103,"raja","wipro",5679.0);
		/*List<Employee> list=new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);*/
		List<Employee> list = Arrays.asList(e,e1,e2);
		model.addAttribute("empObj", list);
        
		//map data send
		Map<String, String> map = Map.of("p1", "copy", "p2","pen" , "p3","book", "p4","pencile","p5", "bag");
		model.addAttribute("map", map);
		return "empData";
	}

}
