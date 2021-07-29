package com.tothenew.jpa2.exercise.jpa_2_exercise.repository;

import com.tothenew.jpa2.exercise.jpa_2_exercise.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
