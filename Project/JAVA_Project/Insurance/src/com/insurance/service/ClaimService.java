package com.insurance.service;

import com.insurance.impl.ClaimImpl;
import com.insurance.models.Claim;
import com.insurance.repository.ClaimRepository;
import java.util.List;

public class ClaimService {
    public void manageClaims() {
        ClaimImpl claimImpl = new ClaimImpl();
        ClaimRepository claimRepository = new ClaimRepository();

        // Add all claims
        List<Claim> claims = claimRepository.getSampleClaims();
        claimImpl.addAllClaims(claims);

        // Read a claim
        Claim claim = claimImpl.getClaim("CL001");
        System.out.println("Claim Details: ");
        System.out.println("Status: " + claim.getStatus() + ", Policy ID: " + claim.getPolicyId());

        // Update a claim
        claim.setStatus("Approved");
        claimImpl.updateClaim("CL001", claim);
        System.out.println("Updated Claim Details: ");
        System.out.println("Status: " + claim.getStatus() + ", Policy ID: " + claim.getPolicyId());

        // Delete a claim
        claimImpl.deleteClaim("CL002");

        // Display all remaining claims
        System.out.println("Remaining Claims: ");
        for (Claim remainingClaim : claimImpl.getClaims().values()) {
            System.out.println("Claim ID: " + remainingClaim.getClaimId() + ", Status: " + remainingClaim.getStatus());
        }
    }
}