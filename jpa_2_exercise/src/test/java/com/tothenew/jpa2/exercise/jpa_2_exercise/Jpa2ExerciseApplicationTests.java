package com.tothenew.jpa2.exercise.jpa_2_exercise;

import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.CardPay;
import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.CheckPay;
import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.Payment;
import com.tothenew.jpa2.exercise.jpa_2_exercise.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jpa2ExerciseApplicationTests {
	@Autowired
	PaymentRepository paymentRepository;
	@Test
	void contextLoads() {
	}
	
	@Test
	void test1(){
		CardPay obj = new CardPay();
		
//		obj.setId(1);
		obj.setMode("card");
		obj.setCardNumber(1234);
		paymentRepository.save(obj);
		CheckPay obj2 = new CheckPay();
		obj2.setMode("check");
		obj2.setChNumber(4321);
		paymentRepository.save(obj2);
//		obj2.setId();
	}
}
