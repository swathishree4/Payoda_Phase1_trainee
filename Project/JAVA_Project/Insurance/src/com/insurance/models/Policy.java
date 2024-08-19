package com.insurance.models;

/**
 * Represents an insurance policy.
 */
public class Policy {
    private String policyId;
    private String customerId;
    private String type;
    private double coverageAmount;

    public Policy(String policyId, String customerId, String type, double coverageAmount) {
        this.policyId = policyId;
        this.customerId = customerId;
        this.type = type;
        this.coverageAmount = coverageAmount;
    }

    // Getters and Setters
    public String getPolicyId() { return policyId; }
    public void setPolicyId(String policyId) { this.policyId = policyId; }
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getCoverageAmount() { return coverageAmount; }
    public void setCoverageAmount(double coverageAmount) { this.coverageAmount = coverageAmount; }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", type='" + type + '\'' +
                ", coverageAmount=" + coverageAmount +
                '}';
    }
}
