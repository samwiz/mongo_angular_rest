package com.igt.customer.service;

import com.igt.customer.data.model.Employee;

public interface EmployeeService {
	
	public Employee findByFirstName(String firstName);

}
