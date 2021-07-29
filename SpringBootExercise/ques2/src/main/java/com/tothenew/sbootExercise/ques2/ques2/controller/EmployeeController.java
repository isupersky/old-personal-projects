package com.tothenew.sbootExercise.ques2.ques2.controller;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.tothenew.sbootExercise.ques2.ques2.dao.EmployeeDao;
import com.tothenew.sbootExercise.ques2.ques2.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

//    Implement GET http request for Employee to get list of employees.
    @GetMapping(path = "/employees")
    public List showAllEmployee(){
        return employeeDao.getEmployeeList();
    }

//    Implement GET http request using path variable to get one employee
    @GetMapping(path = "employees/{id}")
    public Employee showEmployeeByID(@PathVariable Integer id){
        Employee temp = employeeDao.getEmployeeList()
                .stream()
                .filter(employee -> employee.getId()== id)
                .collect(Collectors.toList()).get(0);
        return temp;
    }

//    Implement POST http request for Employee to create a new employee.
    @PostMapping(path = "/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeDao.setEmployeeList(employee);
    }


//    Implement DELETE http request for Employee to delete employee
    @DeleteMapping(path = "/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeDao.deleteEmployee(id);

    }

//    Implement PUT http request for Employee to update employee
    @PutMapping(path ="employees/{id}")
    public void putEmployee(@PathVariable Integer id,  @RequestBody Employee employee){
        employeeDao.putEmployee(id, employee);
    }
}
