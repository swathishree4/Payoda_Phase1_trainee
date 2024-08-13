package com.insurance.intf;

import com.insurance.models.CustomerDetails;

import java.util.List;

public interface CustomerDetailsIntf {
    void addCustomer(CustomerDetails customer);
    void addAllCustomers(List<CustomerDetails> customers);
    CustomerDetails getCustomer(String customerId);
    void updateCustomer(String customerId, CustomerDetails customer);
    void deleteCustomer(String customerId);
}