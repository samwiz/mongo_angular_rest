package com.igt.customer.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igt.customer.data.model.Employee;



	
	@Repository
	public interface EmployeeRepository  extends MongoRepository<Employee, String> {

	    public Employee findByFirstName(String firstName);
	    

	} 



