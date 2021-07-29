package com.tothenew.jpa2.exercise.jpa_2_exercise.entity;

import javax.persistence.*;

@Entity
//@DiscriminatorValue(value = "ch")
@PrimaryKeyJoinColumn(name = "id")
public class CheckPay extends Payment {
	private int chNumber;
	
	public CheckPay() {
	}
	
	public int getChNumber() {
		return chNumber;
	}
	
	public void setChNumber(int chNumber) {
		this.chNumber = chNumber;
	}
	
	@Override
	public String toString() {
		return "CheckPay{" +
				"chNumber=" + chNumber +
				'}';
	}
}
