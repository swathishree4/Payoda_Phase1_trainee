package com.insurance.service;

import com.insurance.models.CustomerDetails;
import com.insurance.repository.CustomerDetailsRepository;

/**
 * Service class for managing CustomerDetails operations.
 */
public class CustomerDetailsService {
    private final CustomerDetailsRepository repository;

    public CustomerDetailsService(CustomerDetailsRepository repository) {
        this.repository = repository;
    }

    public void addCustomerDetails(CustomerDetails customerDetails) {
        repository.addCustomerDetails(customerDetails);
    }

    public CustomerDetails getCustomerDetails(String customerId) {
        return repository.getCustomerDetailsById(customerId);
    }

    public void updateCustomerDetails(CustomerDetails customerDetails) {
        repository.updateCustomerDetails(customerDetails);
    }

    public void deleteCustomerDetails(String customerId) {
        repository.deleteCustomerDetails(customerId);
    }

    public void printAllCustomerDetails() {
        repository.getAllCustomerDetails().forEach(System.out::println);
    }
}
