package com.insurance.intf;

import com.insurance.models.Payment;

/**
 * Interface for Payment operations.
 */
public interface PaymentIntf {
    void addPayment(Payment payment);
    Payment getPayment(String paymentId);
    void updatePayment(Payment payment);
    void deletePayment(String paymentId);
    void printAllPayments();
}
