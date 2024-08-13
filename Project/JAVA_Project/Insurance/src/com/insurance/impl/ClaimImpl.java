package com.insurance.impl;

import com.insurance.intf.ClaimIntf;
import com.insurance.models.Claim;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClaimImpl implements ClaimIntf {
    private Map<String, Claim> claims = new HashMap<>();

    @Override
    public void addClaim(Claim claim) {
        claims.put(claim.getClaimId(), claim);
    }

    @Override
    public void addAllClaims(List<Claim> claimsList) {
        for (Claim claim : claimsList) {
            claims.put(claim.getClaimId(), claim);
        }
    }

    @Override
    public Claim getClaim(String claimId) {
        return claims.get(claimId);
    }

    @Override
    public void updateClaim(String claimId, Claim claim) {
        claims.put(claimId, claim);
    }

    @Override
    public void deleteClaim(String claimId) {
        claims.remove(claimId);
    }

	public Map<String, Claim> getClaims() {
		return claims;
	}

	public void setClaims(Map<String, Claim> claims) {
		this.claims = claims;
	}
}