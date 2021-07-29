package com.tothenew.jpa2.exercise.jpa_2_exercise.repository;

import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

//	Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
	@Query("select firstName, lastName from Employee " +
			"where Salary > (select AVG(Salary) from Employee)" +
			"Order By age ASC")
	List<Object> getEmpNameByAgeAscAndSalaryDESC(Sort sort);
	
//	Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
	@Query("select AVG(Salary) from Employee")
	Long findAverage();
	
	@Modifying
	@Query("UPDATE Employee " +
			"SET Salary= :salary " +
			"where Salary < :average ")
	void updateEmployeeSalaryWithSalaryLessThanAverage(@Param("salary") Long salary, @Param("average") Long average);
	
	
//	Delete all employees with minimum salary.
	@Query("select min(Salary) from Employee")
	Long findminsal();
	
	@Transactional
	@Query(value = "delete from Employee where Salary=:salary")
	@Modifying
	void deletingEmployeesHavingMinimumSalary(@Param("salary") Long salary);
	
	
//	Display the id, first name, age of all employees where last name ends with "singh"
	
	@Query(nativeQuery = true, value = "select id, emp_first_name, emp_age from employee where emp_last_name = 'singh'")
	List<Object> displayEmployeeWithLastNameSingh();
	
	
////	Delete all employees with age greater than 45(Should be passed as a parameter)
//	@Query(value = "delete from employee where emp_age=:age")
//	void deleteEmployeeByAge(@Param("age") Integer age);
}
