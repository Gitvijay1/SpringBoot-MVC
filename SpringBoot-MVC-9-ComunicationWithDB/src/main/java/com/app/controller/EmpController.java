package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Employee;
import com.app.service.EmployeeService;
@Controller
public class EmpController {
	
	private Logger log=LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	private EmployeeService service;
	
	//show registratiom age
	@RequestMapping("/reg")
	public String regPage()
	{
		return "register";
	}
	
	//read form data
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	//read data from ui
	public String saveData(@ModelAttribute Employee employee, Model model)
	{
		Integer eid = service.saveEmployee(employee);
		//write massage
		String msg=eid+" data save succesfully";
		//show msg to ui
		model.addAttribute("Massage", msg);
		return "register";
	}
	
	//fatch all data
	@RequestMapping("/all")
	public String fatchEmp(Model model)
	{
		log.info("intered into method");
		//select data from table
		log.info("before calling service method");
		List<Employee> list = service.fatchData();
		log.info("After calling service method");
		//send data to ui
		model.addAttribute("list",list);
		log.info("about to return responce ready for exist");
		return "datapage";
	}
	
	//delete data
	@RequestMapping("/delete")
	public String deleteData(@RequestParam ("eid")Integer eid,Model model)
	{
		service.deleteEmpData(eid);
		//send msg to ui
		model.addAttribute("godata","one row deleted");
		//send remaining data
		//read form data from db
		List<Employee> list = service.fatchData();
		model.addAttribute("list", list);
		return "datapage";
	}
	//edit data
	@RequestMapping("/edit")
	public String editEmp(@RequestParam ("eid")Integer eid,Model model)
	{
		Employee oneRow = service.fatchOneRow(eid);
		model.addAttribute("ob", oneRow);
		return "editpage";
	}

}
