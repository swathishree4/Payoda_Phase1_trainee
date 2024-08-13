package com.insurance.models;

public class Policy {
    private String policyId;
    private String customerId;
    private String policyType;

    public Policy(String policyId, String customerId, String policyType) {
        this.policyId = policyId;
        this.customerId = customerId;
        this.policyType = policyType;
    }

    // Getters and Setters
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
}