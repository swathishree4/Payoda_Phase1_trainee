package com.insurance.service;

import com.insurance.impl.PaymentImpl;
import com.insurance.models.Payment;
import com.insurance.repository.PaymentRepository;
import java.util.List;

public class PaymentService {
    public void managePayments() {
        PaymentImpl paymentImpl = new PaymentImpl();
        PaymentRepository paymentRepository = new PaymentRepository();

        // Add all payments
        List<Payment> payments = paymentRepository.getSamplePayments();
        paymentImpl.addAllPayments(payments);

        // Read a payment
        Payment payment = paymentImpl.getPayment("P001");
        System.out.println("Payment Details: ");
        System.out.println("Amount: " + payment.getAmount() + ", Customer ID: " + payment.getCustomerId());

        // Update a payment
        payment.setAmount(550.00);
        paymentImpl.updatePayment("P001", payment);
        System.out.println("Updated Payment Details: ");
        System.out.println("Amount: " + payment.getAmount() + ", Customer ID: " + payment.getCustomerId());

        // Delete a payment
        paymentImpl.deletePayment("P002");

        // Display all remaining payments
        System.out.println("Remaining Payments: ");
        for (Payment remainingPayment : paymentImpl.getPayments().values()) {
            System.out.println("Payment ID: " + remainingPayment.getPaymentId() + ", Amount: " + remainingPayment.getAmount());
        }
    }
}