package com.insurance.models;

/**
 * Represents an insurance claim.
 */
public class Claim {
    private String claimId;
    private String policyId;
    private double claimAmount;
    private String date;

    public Claim(String claimId, String policyId, double claimAmount, String date) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.claimAmount = claimAmount;
        this.date = date;
    }

    // Getters and Setters
    public String getClaimId() { return claimId; }
    public void setClaimId(String claimId) { this.claimId = claimId; }
    public String getPolicyId() { return policyId; }
    public void setPolicyId(String policyId) { this.policyId = policyId; }
    public double getClaimAmount() { return claimAmount; }
    public void setClaimAmount(double claimAmount) { this.claimAmount = claimAmount; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId='" + claimId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", claimAmount=" + claimAmount +
                ", date='" + date + '\'' +
                '}';
    }
}
