package com.exam.examserver.exception;

import java.util.List;

import com.exam.examserver.model.Payment;


public class PaymentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PaymentException(String message) {
		super(message);
	}
	public static boolean checkIfListEmpty(List<Payment> allPayments) {
		if(allPayments.isEmpty()) {
			return true;
		}
		return false;
	}
	
}
