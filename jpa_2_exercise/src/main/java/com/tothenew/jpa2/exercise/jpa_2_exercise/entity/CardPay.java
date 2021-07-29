package com.tothenew.jpa2.exercise.jpa_2_exercise.entity;


import javax.persistence.*;

@Entity
//@DiscriminatorValue(value = "cr")
@PrimaryKeyJoinColumn(name = "id")
public class CardPay extends Payment {
	private int cardNumber;
	
	public CardPay() {
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public String toString() {
		return "CardPay{" +
				"cardNumber=" + cardNumber +
				'}';
	}
}
