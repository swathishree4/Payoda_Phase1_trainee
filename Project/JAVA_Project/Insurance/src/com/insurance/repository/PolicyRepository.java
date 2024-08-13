package com.insurance.repository;

import com.insurance.models.Policy;
import java.util.ArrayList;
import java.util.List;

public class PolicyRepository {
    public List<Policy> getSamplePolicies() {
        List<Policy> policies = new ArrayList<>();
        policies.add(new Policy("PL001", "C001", "Health"));
        policies.add(new Policy("PL002", "C002", "Auto"));
        return policies;
    }
}