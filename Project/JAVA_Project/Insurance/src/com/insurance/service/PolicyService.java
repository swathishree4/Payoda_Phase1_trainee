package com.insurance.service;

import com.insurance.models.Policy;
import com.insurance.repository.PolicyRepository;

/**
 * Service class for managing Policy operations.
 */
public class PolicyService {
    private final PolicyRepository repository;

    public PolicyService(PolicyRepository repository) {
        this.repository = repository;
    }

    public void addPolicy(Policy policy) {
        repository.addPolicy(policy);
    }

    public Policy getPolicy(String policyId) {
        return repository.getPolicyById(policyId);
    }

    public void updatePolicy(Policy policy) {
        repository.updatePolicy(policy);
    }

    public void deletePolicy(String policyId) {
        repository.deletePolicy(policyId);
    }

    public void printAllPolicies() {
        repository.getAllPolicies().forEach(System.out::println);
    }
}
