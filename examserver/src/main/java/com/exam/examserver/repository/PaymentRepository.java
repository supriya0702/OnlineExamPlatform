package com.exam.examserver.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.examserver.model.Payment;

@Repository

public interface PaymentRepository  extends JpaRepository<Payment,Integer>{



}
