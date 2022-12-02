package com.exam.examserver.service;

import java.util.List;

import com.exam.examserver.exception.PaymentException;
import com.exam.examserver.model.Payment;

public interface PaymentService {
	
	
	public List<Payment> getAllTransactions()throws PaymentException;

	public Payment getTransactionById(int transactionId) throws PaymentException;

	public void deleteTransaction(int transactionId)throws PaymentException;


	public Payment addPayment(Payment payment);

}

