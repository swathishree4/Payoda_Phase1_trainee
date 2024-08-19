package com.insurance.impl;

import com.insurance.intf.ClaimIntf;
import com.insurance.models.Claim;
import com.insurance.repository.ClaimRepository;

/**
 * Implementation of ClaimIntf.
 */
public class ClaimImpl implements ClaimIntf {
    private final ClaimRepository repository;

    public ClaimImpl(ClaimRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addClaim(Claim claim) {
        repository.addClaim(claim);
    }

    @Override
    public Claim getClaim(String claimId) {
        return repository.getClaimById(claimId);
    }

    @Override
    public void updateClaim(Claim claim) {
        repository.updateClaim(claim);
    }

    @Override
    public void deleteClaim(String claimId) {
        repository.deleteClaim(claimId);
    }

    @Override
    public void printAllClaims() {
        repository.getAllClaims().forEach(System.out::println);
    }
}
