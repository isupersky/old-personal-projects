//Create an Employee entity having following fields: id, firstName, lastName, salary, age
// which maps to the table columns given in above.


package com.tothenew.jpa2.exercise.jpa_2_exercise.entity;


import javax.persistence.*;

@Entity
public class Employee  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "empFirstName")
	private String firstName;
	@Column(name = "empLastName")
	private String lastName;
	@Column(name = "empSalary")
	private Long Salary;
	@Column(name = "empAge")
	private int age;
	
	public Employee() {
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Long getSalary() {
		return Salary;
	}
	
	public void setSalary(Long salary) {
		Salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", Salary=" + Salary +
				", age=" + age +
				'}';
	}
}
