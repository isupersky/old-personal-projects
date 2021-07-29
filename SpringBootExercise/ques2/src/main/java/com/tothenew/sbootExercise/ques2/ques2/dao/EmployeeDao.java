package com.tothenew.sbootExercise.ques2.ques2.dao;

import com.tothenew.sbootExercise.ques2.ques2.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDao {
    public static List<Employee> employeeList = new ArrayList<>();

//    public EmployeeDao(Employee employee){
//        employeeList.add(employee);
//    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Employee employee){
        employeeList.add(employee);
    }
    public void deleteEmployee(Integer id){
        Iterator<Employee> iterator = employeeList.iterator();
         while (iterator.hasNext()){
             if(iterator.next().getId()==id){
                 iterator.remove();
             }
         }
    }
    public void putEmployee(Integer id, Employee employee){
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId()==id){
//                iterator.next()=employee
                iterator.next().setName(employee.getName());
                iterator.next().setAge(employee.getAge());
            }
        }
    }

}
