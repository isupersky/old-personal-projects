package com.tothenew.jpa2.exercise.jpa_2_exercise.service;

import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.Employee;
import com.tothenew.jpa2.exercise.jpa_2_exercise.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeList(){
		List<Employee> tempList = new ArrayList<>();
		employeeRepository.findAll().forEach(e -> tempList.add(e));
		
		return tempList;
	}
	
	public void addEmployee(Employee employee){
		employeeRepository.save(employee);
		
	}
	
	public List<Object> ques1(){
		
		return employeeRepository.getEmpNameByAgeAscAndSalaryDESC(Sort.by(Sort.Direction.DESC, "Salary"));
	}
	
	
	
	
	@Transactional
	public void ques2(Long salary){
		Long tempSalAvg = employeeRepository.findAverage();
		
		employeeRepository.updateEmployeeSalaryWithSalaryLessThanAverage(salary,tempSalAvg);
	}
	
	
	@Transactional
	public void ques3() {
		Long minsal = employeeRepository.findminsal();
		employeeRepository.deletingEmployeesHavingMinimumSalary(minsal);
//		employeeRepository.deletingEmployeesHavingMinimumSalary(employeeRepository.findminsal());
	}
//
//	public List<Object> nativeQus1(){
//		return employeeRepository.displayEmployeeWithLastNameSingh();
		
//	}
}
