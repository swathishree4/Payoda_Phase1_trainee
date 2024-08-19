package com.insurance.intf;

import com.insurance.models.Policy;

/**
 * Interface for Policy operations.
 */
public interface PolicyIntf {
    void addPolicy(Policy policy);
    Policy getPolicy(String policyId);
    void updatePolicy(Policy policy);
    void deletePolicy(String policyId);
    void printAllPolicies();
}
