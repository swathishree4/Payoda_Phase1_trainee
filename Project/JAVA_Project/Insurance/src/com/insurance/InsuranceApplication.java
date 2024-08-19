package com.insurance;

/**
 * Main class for the Insurance Application.
 * <p>
 * This application demonstrates CRUD operations (Create, Read, Update, Delete)
 * on CustomerDetails, Payment, Policy, and Claim entities using repositories and services.
 * </p>
 */
public class InsuranceApplication {
    public static void main(String[] args) {
        // Initialize repositories
        com.insurance.repository.CustomerDetailsRepository customerDetailsRepository = new com.insurance.repository.CustomerDetailsRepository();
        com.insurance.repository.PaymentRepository paymentRepository = new com.insurance.repository.PaymentRepository();
        com.insurance.repository.PolicyRepository policyRepository = new com.insurance.repository.PolicyRepository();
        com.insurance.repository.ClaimRepository claimRepository = new com.insurance.repository.ClaimRepository();

        // Initialize services
        com.insurance.service.CustomerDetailsService customerDetailsService = new com.insurance.service.CustomerDetailsService(customerDetailsRepository);
        com.insurance.service.PaymentService paymentService = new com.insurance.service.PaymentService(paymentRepository);
        com.insurance.service.PolicyService policyService = new com.insurance.service.PolicyService(policyRepository);
        com.insurance.service.ClaimService claimService = new com.insurance.service.ClaimService(claimRepository);

        // Create and add entities
        com.insurance.models.CustomerDetails customer1 = new com.insurance.models.CustomerDetails("C001", "John Doe", "john.doe@example.com");
        com.insurance.models.CustomerDetails customer2 = new com.insurance.models.CustomerDetails("C002", "Jane Smith", "jane.smith@example.com");
        com.insurance.models.Payment payment1 = new com.insurance.models.Payment("P001", "C001", 1000.0, "2024-08-16");
        com.insurance.models.Policy policy1 = new com.insurance.models.Policy("POL001", "C001", "Health", 50000.0);
        com.insurance.models.Claim claim1 = new com.insurance.models.Claim("CL001", "POL001", 2000.0, "2024-08-16");

        customerDetailsService.addCustomerDetails(customer1);
        customerDetailsService.addCustomerDetails(customer2);
        paymentService.addPayment(payment1);
        policyService.addPolicy(policy1);
        claimService.addClaim(claim1);

        // Read entities
        System.out.println("Reading Customer Details:");
        com.insurance.models.CustomerDetails readCustomer = customerDetailsService.getCustomerDetails("C001");
        System.out.println(readCustomer);

        System.out.println("\nReading Payment:");
        com.insurance.models.Payment readPayment = paymentService.getPayment("P001");
        System.out.println(readPayment);

        System.out.println("\nReading Policy:");
        com.insurance.models.Policy readPolicy = policyService.getPolicy("POL001");
        System.out.println(readPolicy);

        System.out.println("\nReading Claim:");
        com.insurance.models.Claim readClaim = claimService.getClaim("CL001");
        System.out.println(readClaim);

        // Update entities
        com.insurance.models.CustomerDetails updatedCustomer = new com.insurance.models.CustomerDetails("C001", "John Doe", "john.doe@newemail.com");
        customerDetailsService.updateCustomerDetails(updatedCustomer);

        com.insurance.models.Payment updatedPayment = new com.insurance.models.Payment("P001", "C001", 1200.0, "2024-08-17");
        paymentService.updatePayment(updatedPayment);

        com.insurance.models.Policy updatedPolicy = new com.insurance.models.Policy("POL001", "C001", "Health", 55000.0);
        policyService.updatePolicy(updatedPolicy);

        com.insurance.models.Claim updatedClaim = new com.insurance.models.Claim("CL001", "POL001", 2500.0, "2024-08-17");
        claimService.updateClaim(updatedClaim);

        // Print all entities after update
        System.out.println("\nCustomer Details After Update:");
        customerDetailsService.printAllCustomerDetails();

        System.out.println("\nPayments After Update:");
        paymentService.printAllPayments();

        System.out.println("\nPolicies After Update:");
        policyService.printAllPolicies();

        System.out.println("\nClaims After Update:");
        claimService.printAllClaims();

        // Delete entities
        customerDetailsService.deleteCustomerDetails("C002");
        paymentService.deletePayment("P001");
        policyService.deletePolicy("POL001");
        claimService.deleteClaim("CL001");

        // Print all entities after deletion
        System.out.println("\nCustomer Details After Deletion:");
        customerDetailsService.printAllCustomerDetails();

        System.out.println("\nPayments After Deletion:");
        paymentService.printAllPayments();

        System.out.println("\nPolicies After Deletion:");
        policyService.printAllPolicies();

        System.out.println("\nClaims After Deletion:");
        claimService.printAllClaims();
    }
}
