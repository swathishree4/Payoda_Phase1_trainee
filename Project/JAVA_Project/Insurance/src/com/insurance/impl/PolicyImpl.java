package com.insurance.impl;

import com.insurance.intf.PolicyIntf;
import com.insurance.models.Policy;
import com.insurance.repository.PolicyRepository;

/**
 * Implementation of PolicyIntf.
 */
public class PolicyImpl implements PolicyIntf {
    private final PolicyRepository repository;

    public PolicyImpl(PolicyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addPolicy(Policy policy) {
        repository.addPolicy(policy);
    }

    @Override
    public Policy getPolicy(String policyId) {
        return repository.getPolicyById(policyId);
    }

    @Override
    public void updatePolicy(Policy policy) {
        repository.updatePolicy(policy);
    }

    @Override
    public void deletePolicy(String policyId) {
        repository.deletePolicy(policyId);
    }

    @Override
    public void printAllPolicies() {
        repository.getAllPolicies().forEach(System.out::println);
    }
}
