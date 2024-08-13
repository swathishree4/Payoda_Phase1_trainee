package com.insurance.service;

import com.insurance.impl.CustomerDetailsImpl;
import com.insurance.models.CustomerDetails;
import com.insurance.repository.CustomerDetailsRepository;

import java.util.List;

public class CustomerDetailsService {
    public void manageCustomers() {
        CustomerDetailsImpl customerImpl = new CustomerDetailsImpl();
        CustomerDetailsRepository customerRepository = new CustomerDetailsRepository();

        // Add all customers
        List<CustomerDetails> customers = customerRepository.getSampleCustomers();
        customerImpl.addAllCustomers(customers);

        // Read a customer
        CustomerDetails customer = customerImpl.getCustomer("C001");
        System.out.println("Customer Details: ");
        System.out.println("Name: " + customer.getName() + ", Address: " + customer.getAddress());

        // Update a customer
        customer.setContactNumber("555-9999");
        customerImpl.updateCustomer("C001", customer);
        System.out.println("Updated Customer Details: ");
        System.out.println("Name: " + customer.getName() + ", Contact Number: " + customer.getContactNumber());

        // Delete a customer
        customerImpl.deleteCustomer("C002");

        // Display all remaining customers
        System.out.println("Remaining Customers: ");
        for (CustomerDetails remainingCustomer : customerImpl.getCustomers().values()) {
            System.out.println("Customer ID: " + remainingCustomer.getCustomerId() + ", Name: " + remainingCustomer.getName());
        }
    }
}