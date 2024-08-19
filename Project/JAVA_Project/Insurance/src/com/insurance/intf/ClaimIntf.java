package com.insurance.intf;

import com.insurance.models.Claim;

/**
 * Interface for Claim operations.
 */
public interface ClaimIntf {
    void addClaim(Claim claim);
    Claim getClaim(String claimId);
    void updateClaim(Claim claim);
    void deleteClaim(String claimId);
    void printAllClaims();
}
