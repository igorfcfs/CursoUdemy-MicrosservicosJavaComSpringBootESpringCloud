package com.devsuperior.payroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.payroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Beatriz", 200.0, days); // dados mock - dado hard-coded
	}
}
