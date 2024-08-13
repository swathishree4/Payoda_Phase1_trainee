package com.insurance.service;

import com.insurance.impl.PolicyImpl;
import com.insurance.models.Policy;
import com.insurance.repository.PolicyRepository;
import java.util.List;

public class PolicyService {
    public void managePolicies() {
        PolicyImpl policyImpl = new PolicyImpl();
        PolicyRepository policyRepository = new PolicyRepository();

        // Add all policies
        List<Policy> policies = policyRepository.getSamplePolicies();
        policyImpl.addAllPolicies(policies);

        // Read a policy
        Policy policy = policyImpl.getPolicy("PL001");
        System.out.println("Policy Details: ");
        System.out.println("Policy Type: " + policy.getPolicyType() + ", Customer ID: " + policy.getCustomerId());

        // Update a policy
        policy.setPolicyType("Life");
        policyImpl.updatePolicy("PL001", policy);
        System.out.println("Updated Policy Details: ");
        System.out.println("Policy Type: " + policy.getPolicyType() + ", Customer ID: " + policy.getCustomerId());

        // Delete a policy
        policyImpl.deletePolicy("PL002");

        // Display all remaining policies
        System.out.println("Remaining Policies: ");
        for (Policy remainingPolicy : policyImpl.getPolicies().values()) {
            System.out.println("Policy ID: " + remainingPolicy.getPolicyId() + ", Policy Type: " + remainingPolicy.getPolicyType());
        }
    }
}