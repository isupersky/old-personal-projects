package com.jpqlexample.jpqlclass.repository;

import com.jpqlexample.jpqlclass.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
