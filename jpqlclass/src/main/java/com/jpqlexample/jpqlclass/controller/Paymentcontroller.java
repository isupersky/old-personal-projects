package com.jpqlexample.jpqlclass.controller;

import com.jpqlexample.jpqlclass.entity.CheckPay;
import com.jpqlexample.jpqlclass.entity.CreditCard;
import com.jpqlexample.jpqlclass.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Paymentcontroller {
	@Autowired
	PaymentRepository paymentRepository;
	
	@GetMapping(path = "/pay-credit")
	public void addPayment(){
		
		CreditCard creditCard= new CreditCard();
//		creditCard.setId();
		creditCard.setCardNumber(1);
		
		CheckPay checkPay = new CheckPay();
		checkPay.setCheckNumber(2);
		
		paymentRepository.save(creditCard);
		paymentRepository.save(checkPay);
		
	}
	
}
