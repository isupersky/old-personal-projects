package com.jpqlexample.jpqlclass.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@DiscriminatorValue("cc")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CreditCard extends Payment {
	
	private Integer cardNumber;
	
	public CreditCard() {
	}
	
	public Integer getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public String toString() {
		return "CreditCard{" +
				"cardNumber=" + cardNumber +
				", id=" + id +
				'}';
	}
}
