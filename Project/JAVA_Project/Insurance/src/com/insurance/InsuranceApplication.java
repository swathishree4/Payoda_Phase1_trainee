package com.insurance;

import com.insurance.service.CustomerDetailsService;
import com.insurance.service.PaymentService;
import com.insurance.service.PolicyService;
import com.insurance.service.ClaimService;

public class InsuranceApplication {
    public static void main(String[] args) {
        // Manage Customer Details
        CustomerDetailsService customerService = new CustomerDetailsService();
        customerService.manageCustomers();

        // Manage Payments
        PaymentService paymentService = new PaymentService();
        paymentService.managePayments();

        // Manage Policies
        PolicyService policyService = new PolicyService();
        policyService.managePolicies();

        // Manage Claims
        ClaimService claimService = new ClaimService();
        claimService.manageClaims();
    }
}