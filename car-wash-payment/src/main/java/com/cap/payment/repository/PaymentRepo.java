package com.cap.payment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cap.payment.model.Payment;

@Repository
public interface PaymentRepo extends CrudRepository<Payment,Long> {

	Payment findByTxnId(String txnid);




}
