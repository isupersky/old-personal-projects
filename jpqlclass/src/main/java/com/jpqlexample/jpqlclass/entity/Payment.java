package com.jpqlexample.jpqlclass.entity;

import javax.persistence.*;

@Entity
//@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Payment {
	@Id
			@GeneratedValue(strategy = GenerationType.TABLE)
	Integer id;
	
	public Payment() {	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Payment{" +
				"id=" + id +
				'}';
	}
}
