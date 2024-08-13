package com.insurance.intf;

import com.insurance.models.Payment;

import java.util.List;

public interface PaymentIntf {
    void addPayment(Payment payment);
    void addAllPayments(List<Payment> payments);
    Payment getPayment(String paymentId);
    void updatePayment(String paymentId, Payment payment);
    void deletePayment(String paymentId);
}