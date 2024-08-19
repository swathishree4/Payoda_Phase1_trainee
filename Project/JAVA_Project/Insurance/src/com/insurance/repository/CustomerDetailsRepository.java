package com.insurance.repository;

import com.insurance.models.CustomerDetails;
import java.util.*;

/**
 * Repository for managing CustomerDetails data.
 */
public class CustomerDetailsRepository {
    private Map<String, CustomerDetails> customerDetailsMap = new HashMap<>();

    public void addCustomerDetails(CustomerDetails customerDetails) {
        customerDetailsMap.put(customerDetails.getCustomerId(), customerDetails);
    }

    public CustomerDetails getCustomerDetailsById(String customerId) {
        return customerDetailsMap.get(customerId);
    }

    public void updateCustomerDetails(CustomerDetails customerDetails) {
        customerDetailsMap.put(customerDetails.getCustomerId(), customerDetails);
    }

    public void deleteCustomerDetails(String customerId) {
        customerDetailsMap.remove(customerId);
    }

    public Collection<CustomerDetails> getAllCustomerDetails() {
        return customerDetailsMap.values();
    }
}
