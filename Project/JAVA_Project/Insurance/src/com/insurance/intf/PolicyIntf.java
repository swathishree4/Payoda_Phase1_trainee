package com.insurance.intf;

import com.insurance.models.Policy;
import java.util.List;

public interface PolicyIntf {
    void addPolicy(Policy policy);
    void addAllPolicies(List<Policy> policies);
    Policy getPolicy(String policyId);
    void updatePolicy(String policyId, Policy policy);
    void deletePolicy(String policyId);
}