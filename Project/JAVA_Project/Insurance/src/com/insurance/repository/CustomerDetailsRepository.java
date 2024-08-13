package com.insurance.repository;

import com.insurance.models.CustomerDetails;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetailsRepository {
    public List<CustomerDetails> getSampleCustomers() {
        List<CustomerDetails> customers = new ArrayList<>();
        customers.add(new CustomerDetails("C001", "Alice Brown", "123 Main St", "555-1234"));
        customers.add(new CustomerDetails("C002", "Bob White", "456 Oak St", "555-5678"));
        return customers;
    }
}