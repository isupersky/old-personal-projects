package com.tothenew.jpa2.exercise.jpa_2_exercise.entity;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "pmode", discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String mode;
	
	public Payment() {
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;

	}
	
	@Override
	public String toString() {
		return "Payment{" +
				"id=" + id +
				", mode='" + mode + '\'' +
				'}';
	}
}
