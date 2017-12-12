package com.igt.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.igt.customer.data.model.Employee;
import com.igt.customer.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService; 
	
	
	@RequestMapping("/employee")
    public String employee() {
        return "Greetings from Sam!";
    }
	
	
	
	@RequestMapping(value ="/employee/{name}")
	public Employee findbyName(Model m, @PathVariable String name){
		Employee e = empService.findByFirstName(name);
		return e;
			
	}
	
	
	
}
