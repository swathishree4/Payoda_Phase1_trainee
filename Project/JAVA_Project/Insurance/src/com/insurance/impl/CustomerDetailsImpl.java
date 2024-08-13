package com.insurance.impl;

import com.insurance.intf.CustomerDetailsIntf;
import com.insurance.models.CustomerDetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDetailsImpl implements CustomerDetailsIntf {
    private Map<String, CustomerDetails> customers = new HashMap<>();

    @Override
    public void addCustomer(CustomerDetails customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    @Override
    public void addAllCustomers(List<CustomerDetails> customersList) {
        for (CustomerDetails customer : customersList) {
            customers.put(customer.getCustomerId(), customer);
        }
    }

    @Override
    public CustomerDetails getCustomer(String customerId) {
        return customers.get(customerId);
    }

    @Override
    public void updateCustomer(String customerId, CustomerDetails customer) {
        customers.put(customerId, customer);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customers.remove(customerId);
    }

	public Map<String, CustomerDetails> getCustomers() {
		return customers;
	}

	public void setCustomers(Map<String, CustomerDetails> customers) {
		this.customers = customers;
	}
}