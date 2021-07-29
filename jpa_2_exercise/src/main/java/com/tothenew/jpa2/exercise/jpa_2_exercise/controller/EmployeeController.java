package com.tothenew.jpa2.exercise.jpa_2_exercise.controller;

import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.Employee;
import com.tothenew.jpa2.exercise.jpa_2_exercise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path = "/employees")
	public List<Employee> getEmployeeList(){
		return employeeService.getEmployeeList();
	}
	
	@PostMapping(path = "/employees")
	public void addEmployee(@RequestBody Employee employee){
	employeeService.addEmployee(employee);
	}
	
	
	@GetMapping(path = "/ques1")
	public List<Object> getQues1(){
		return employeeService.ques1();
	}
	
	
	@PostMapping(path = "/ques2/{salary}")
	public void getQues2(@PathVariable("salary") Long salary){ employeeService.ques2(salary);}
	
	
	@DeleteMapping(path = "/ques3")
	public void getQues3(){
		employeeService.ques3();
	}
	
//	@GetMapping(path = "/nativeques1")
//	public List<Object> nativeQues3(){
//		return employeeService.nativeQus1();
//	}
}
