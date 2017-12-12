package com.igt.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igt.customer.data.model.Employee;
import com.igt.customer.data.repository.EmployeeRepository;
import com.igt.customer.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	
	public Employee findByFirstName(String firstName){
		Employee emp =empRepository.findByFirstName(firstName);
		return emp;
		
	}

}
