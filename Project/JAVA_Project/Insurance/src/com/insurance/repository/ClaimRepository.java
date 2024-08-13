package com.insurance.repository;

import com.insurance.models.Claim;
import java.util.ArrayList;
import java.util.List;

public class ClaimRepository {
    public List<Claim> getSampleClaims() {
        List<Claim> claims = new ArrayList<>();
        claims.add(new Claim("CL001", "PL001", "Pending"));
        claims.add(new Claim("CL002", "PL002", "Approved"));
        return claims;
    }
}