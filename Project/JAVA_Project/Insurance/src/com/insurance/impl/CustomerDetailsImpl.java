package com.insurance.impl;

import com.insurance.intf.CustomerDetailsIntf;
import com.insurance.models.CustomerDetails;
import com.insurance.repository.CustomerDetailsRepository;

/**
 * Implementation of CustomerDetailsIntf.
 */
public class CustomerDetailsImpl implements CustomerDetailsIntf {
    private final CustomerDetailsRepository repository;

    public CustomerDetailsImpl(CustomerDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addCustomerDetails(CustomerDetails customerDetails) {
        repository.addCustomerDetails(customerDetails);
    }

    @Override
    public CustomerDetails getCustomerDetails(String customerId) {
        return repository.getCustomerDetailsById(customerId);
    }

    @Override
    public void updateCustomerDetails(CustomerDetails customerDetails) {
        repository.updateCustomerDetails(customerDetails);
    }

    @Override
    public void deleteCustomerDetails(String customerId) {
        repository.deleteCustomerDetails(customerId);
    }

    @Override
    public void printAllCustomerDetails() {
        repository.getAllCustomerDetails().forEach(System.out::println);
    }
}
