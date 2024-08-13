package com.insurance.models;

public class Claim {
    private String claimId;
    private String policyId;
    private String status;

    public Claim(String claimId, String policyId, String status) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.status = status;
    }

    // Getters and Setters
    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}