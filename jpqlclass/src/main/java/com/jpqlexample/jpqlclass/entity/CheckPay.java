package com.jpqlexample.jpqlclass.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@DiscriminatorValue("ch")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CheckPay extends Payment {
	
	private Integer checkNumber;
	
	public CheckPay() {
	}
	
	public Integer getCheckNumber() {
		return checkNumber;
	}
	
	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	@Override
	public String toString() {
		return "CheckPay{" +
				"checkNumber=" + checkNumber +
				", id=" + id +
				'}';
	}
}
