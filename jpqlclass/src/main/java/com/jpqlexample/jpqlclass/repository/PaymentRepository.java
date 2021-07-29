package com.jpqlexample.jpqlclass.repository;

import com.jpqlexample.jpqlclass.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
