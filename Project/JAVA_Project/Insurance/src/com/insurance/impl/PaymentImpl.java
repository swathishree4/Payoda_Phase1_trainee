package com.insurance.impl;

import com.insurance.intf.PaymentIntf;
import com.insurance.models.Payment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentImpl implements PaymentIntf {
    private Map<String, Payment> payments = new HashMap<>();

    @Override
    public void addPayment(Payment payment) {
        payments.put(payment.getPaymentId(), payment);
    }

    @Override
    public void addAllPayments(List<Payment> paymentsList) {
        for (Payment payment : paymentsList) {
            payments.put(payment.getPaymentId(), payment);
        }
    }

    @Override
    public Payment getPayment(String paymentId) {
        return payments.get(paymentId);
    }

    @Override
    public void updatePayment(String paymentId, Payment payment) {
        payments.put(paymentId, payment);
    }

    @Override
    public void deletePayment(String paymentId) {
        payments.remove(paymentId);
    }

	public Map<String, Payment> getPayments() {
		return payments;
	}

	public void setPayments(Map<String, Payment> payments) {
		this.payments = payments;
	}
}