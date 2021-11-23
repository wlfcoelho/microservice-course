package com.devcoelho.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devcoelho.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workwerId, int days) {
		return new Payment("Bob", 200.0, days); 
	}
}
