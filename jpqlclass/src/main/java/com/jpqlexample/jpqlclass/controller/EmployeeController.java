package com.jpqlexample.jpqlclass.controller;

import com.jpqlexample.jpqlclass.entity.Address;
import com.jpqlexample.jpqlclass.entity.Employee;
import com.jpqlexample.jpqlclass.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@GetMapping("/employees")
	public String createEmployee(){
		Address address = new Address();
		address.setCountry("India");
		address.setState("New Delhi");
		address.setZipcode(110089);
		
		Employee employee= new Employee();
		employee.setName("Aakash sinha");
		employee.setAddress(address);
		repository.save(employee);
		return "Success";
		
		
	}
}
