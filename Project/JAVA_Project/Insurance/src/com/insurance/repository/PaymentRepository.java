package com.insurance.repository;

import com.insurance.models.Payment;
import java.util.*;

/**
 * Repository for managing Payment data.
 */
public class PaymentRepository {
    private Map<String, Payment> paymentMap = new HashMap<>();

    public void addPayment(Payment payment) {
        paymentMap.put(payment.getPaymentId(), payment);
    }

    public Payment getPaymentById(String paymentId) {
        return paymentMap.get(paymentId);
    }

    public void updatePayment(Payment payment) {
        paymentMap.put(payment.getPaymentId(), payment);
    }

    public void deletePayment(String paymentId) {
        paymentMap.remove(paymentId);
    }

    public Collection<Payment> getAllPayments() {
        return paymentMap.values();
    }
}
