package com.insurance.repository;

import com.insurance.models.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepository {
    public List<Payment> getSamplePayments() {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment("P001", "C001", 200.00, "2024-08-01"));
        payments.add(new Payment("P002", "C002", 300.00, "2024-08-02"));
        return payments;
    }
}