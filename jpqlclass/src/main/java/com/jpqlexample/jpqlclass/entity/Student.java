package com.jpqlexample.jpqlclass.entity;

import javax.persistence.*;

@Entity
@Table(name = "studenttest")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "fname")
	private String firstName;
	@Column(name = "lname")
	private String lastName;
	@Column(name = "score")
	private int scores;
	
	public Student() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
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
	
	public int getScores() {
		return scores;
	}
	
	public void setScores(int scores) {
		this.scores = scores;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", scores=" + scores +
				'}';
	}
}
