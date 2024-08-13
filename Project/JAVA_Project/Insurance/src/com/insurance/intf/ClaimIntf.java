package com.insurance.intf;

import com.insurance.models.Claim;
import java.util.List;

public interface ClaimIntf {
    void addClaim(Claim claim);
    void addAllClaims(List<Claim> claims);
    Claim getClaim(String claimId);
    void updateClaim(String claimId, Claim claim);
    void deleteClaim(String claimId);
}