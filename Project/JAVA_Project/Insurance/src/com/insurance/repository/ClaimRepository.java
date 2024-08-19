package com.insurance.repository;

import com.insurance.models.Claim;
import java.util.*;

/**
 * Repository for managing Claim data.
 */
public class ClaimRepository {
    private Map<String, Claim> claimMap = new HashMap<>();

    public void addClaim(Claim claim) {
        claimMap.put(claim.getClaimId(), claim);
    }

    public Claim getClaimById(String claimId) {
        return claimMap.get(claimId);
    }

    public void updateClaim(Claim claim) {
        claimMap.put(claim.getClaimId(), claim);
    }

    public void deleteClaim(String claimId) {
        claimMap.remove(claimId);
    }

    public Collection<Claim> getAllClaims() {
        return claimMap.values();
    }
}
