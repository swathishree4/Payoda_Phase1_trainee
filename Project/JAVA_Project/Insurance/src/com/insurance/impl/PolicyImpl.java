package com.insurance.impl;

import com.insurance.intf.PolicyIntf;
import com.insurance.models.Policy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolicyImpl implements PolicyIntf {
    private Map<String, Policy> policies = new HashMap<>();

    @Override
    public void addPolicy(Policy policy) {
        policies.put(policy.getPolicyId(), policy);
    }

    @Override
    public void addAllPolicies(List<Policy> policiesList) {
        for (Policy policy : policiesList) {
            policies.put(policy.getPolicyId(), policy);
        }
    }

    @Override
    public Policy getPolicy(String policyId) {
        return policies.get(policyId);
    }

    @Override
    public void updatePolicy(String policyId, Policy policy) {
        policies.put(policyId, policy);
    }

    @Override
    public void deletePolicy(String policyId) {
        policies.remove(policyId);
    }

	public Map<String, Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(Map<String, Policy> policies) {
		this.policies = policies;
	}
}