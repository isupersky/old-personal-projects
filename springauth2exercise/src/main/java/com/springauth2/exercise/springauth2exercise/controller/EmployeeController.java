package com.springauth2.exercise.springauth2exercise.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping(path = "/")
	public String getTest(){
		return "<h1>Test Home</h1>";
	}
	
	@GetMapping(path = "/user")
	public String getUser(){
		return "<h1>Test User</h1>";
	}
	
	@GetMapping(path = "/admin")
	public String getAdmin(){
		return "<h1>Test Admin</h1>";
	}
	
}



