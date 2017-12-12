package com.igt.customer.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "employee")
public class Employee {
	    @Id
	    public String id;

	    public String firstName;
	    public String lastName;

	    public Employee() {}

	  

	    @Override
	    public String toString() {
	        return String.format(
	                "Employee[id=%s, firstName='%s', lastName='%s']",
	                id, firstName, lastName);
	    }
}


