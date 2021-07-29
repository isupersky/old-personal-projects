//Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

package com.tothenew.sbootExercise.ques2.ques2.entity;

import org.springframework.stereotype.Component;

//import java.util.UUID;

@Component
public class Employee {

    private int id ;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
