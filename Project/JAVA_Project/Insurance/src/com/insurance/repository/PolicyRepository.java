package com.insurance.repository;

import com.insurance.models.Policy;
import java.util.*;

/**
 * Repository for managing Policy data.
 */
public class PolicyRepository {
    private Map<String, Policy> policyMap = new HashMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyId(), policy);
    }

    public Policy getPolicyById(String policyId) {
        return policyMap.get(policyId);
    }

    public void updatePolicy(Policy policy) {
        policyMap.put(policy.getPolicyId(), policy);
    }

    public void deletePolicy(String policyId) {
        policyMap.remove(policyId);
    }

    public Collection<Policy> getAllPolicies() {
        return policyMap.values();
    }
}
