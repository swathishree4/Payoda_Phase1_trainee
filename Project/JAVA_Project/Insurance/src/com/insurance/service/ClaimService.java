package com.insurance.service;

import com.insurance.models.Claim;
import com.insurance.repository.ClaimRepository;

/**
 * Service class for managing Claim operations.
 */
public class ClaimService {
    private final ClaimRepository repository;

    public ClaimService(ClaimRepository repository) {
        this.repository = repository;
    }

    public void addClaim(Claim claim) {
        repository.addClaim(claim);
    }

    public Claim getClaim(String claimId) {
        return repository.getClaimById(claimId);
    }

    public void updateClaim(Claim claim) {
        repository.updateClaim(claim);
    }

    public void deleteClaim(String claimId) {
        repository.deleteClaim(claimId);
    }

    public void printAllClaims() {
        repository.getAllClaims().forEach(System.out::println);
    }
}
