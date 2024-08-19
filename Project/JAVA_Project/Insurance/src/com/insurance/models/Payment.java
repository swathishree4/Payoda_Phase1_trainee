package com.insurance.models;

/**
 * Represents a payment transaction.
 */
public class Payment {
    private String paymentId;
    private String customerId;
    private double amount;
    private String date;

    public Payment(String paymentId, String customerId, double amount, String date) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.amount = amount;
        this.date = date;
    }

    // Getters and Setters
    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
