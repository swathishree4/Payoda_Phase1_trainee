package com.insurance.impl;

import com.insurance.intf.PaymentIntf;
import com.insurance.models.Payment;
import com.insurance.repository.PaymentRepository;

/**
 * Implementation of PaymentIntf.
 */
public class PaymentImpl implements PaymentIntf {
    private final PaymentRepository repository;

    public PaymentImpl(PaymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addPayment(Payment payment) {
        repository.addPayment(payment);
    }

    @Override
    public Payment getPayment(String paymentId) {
        return repository.getPaymentById(paymentId);
    }

    @Override
    public void updatePayment(Payment payment) {
        repository.updatePayment(payment);
    }

    @Override
    public void deletePayment(String paymentId) {
        repository.deletePayment(paymentId);
    }

    @Override
    public void printAllPayments() {
        repository.getAllPayments().forEach(System.out::println);
    }
}
