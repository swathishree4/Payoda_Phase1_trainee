package com.insurance.service;

import com.insurance.models.Payment;
import com.insurance.repository.PaymentRepository;

/**
 * Service class for managing Payment operations.
 */
public class PaymentService {
    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public void addPayment(Payment payment) {
        repository.addPayment(payment);
    }

    public Payment getPayment(String paymentId) {
        return repository.getPaymentById(paymentId);
    }

    public void updatePayment(Payment payment) {
        repository.updatePayment(payment);
    }

    public void deletePayment(String paymentId) {
        repository.deletePayment(paymentId);
    }

    public void printAllPayments() {
        repository.getAllPayments().forEach(System.out::println);
    }
}
